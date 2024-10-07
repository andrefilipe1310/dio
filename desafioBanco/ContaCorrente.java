public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numeroConta, String titular, double limite) {
        super(numeroConta, titular);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta corrente " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }
}
