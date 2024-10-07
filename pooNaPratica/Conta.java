public abstract class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}
