public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente contaCorrente = new ContaCorrente("1234-5", 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("6789-0");

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);

        banco.exibirContas();

        contaCorrente.sacar(300);
        contaPoupanca.aplicarJuros();

        banco.exibirContas();

        banco.transferir(contaCorrente, contaPoupanca, 200);
        banco.exibirContas();
    }
}
