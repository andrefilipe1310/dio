public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(12345, "João", 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(67890, "Maria");

        contaCorrente.depositar(1000.0);
        contaCorrente.sacar(200.0);
        contaCorrente.transferir(300.0, contaPoupanca);

        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());
    }
}
