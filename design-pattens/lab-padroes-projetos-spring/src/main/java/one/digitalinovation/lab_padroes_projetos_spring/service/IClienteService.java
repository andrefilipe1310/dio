package one.digitalinovation.lab_padroes_projetos_spring.service;

import one.digitalinovation.lab_padroes_projetos_spring.model.Cliente;

public interface IClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id,Cliente cliente);
    void deletar(Long id);
}
