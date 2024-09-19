package one.digitalinovation.lab_padroes_projetos_spring.service.implement;

import one.digitalinovation.lab_padroes_projetos_spring.model.Cliente;
import one.digitalinovation.lab_padroes_projetos_spring.model.Endereco;
import one.digitalinovation.lab_padroes_projetos_spring.repository.ClienteRepository;
import one.digitalinovation.lab_padroes_projetos_spring.repository.EnderecoRepository;
import one.digitalinovation.lab_padroes_projetos_spring.service.IClienteService;
import one.digitalinovation.lab_padroes_projetos_spring.service.IViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    IViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
       return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElseThrow(()-> new RuntimeException("Client Not Found"));
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);

        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id,Cliente cliente) {
        Cliente updatedCliente = clienteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Client Not Found"));

        salvarClienteComCep(updatedCliente);
    }

    @Override
    public void deletar(Long id) {
     clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep)
                .orElseGet(()->{
                    Endereco novoEndereco = viaCepService.consultarCep(cep);
                    enderecoRepository.save(novoEndereco);
                    return novoEndereco;
                });
        cliente.setEndereco(endereco);
    }
}
