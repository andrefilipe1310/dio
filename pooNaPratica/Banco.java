import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void transferir(Conta de, Conta para, double valor) {
        de.sacar(valor);
        para.depositar(valor);
    }

    public void exibirContas() {
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
        }
    }
}
