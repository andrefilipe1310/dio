public class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.05;

    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void aplicarJuros() {
        saldo += saldo * TAXA_JUROS;
    }
}
