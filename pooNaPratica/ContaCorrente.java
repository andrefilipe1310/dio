public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
