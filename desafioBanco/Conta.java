public abstract class Conta {
    protected double saldo;
    protected int numeroConta;
    protected String titular;

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado na conta " + numeroConta);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " da conta " + numeroConta + " para a conta " + contaDestino.numeroConta + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para transferência de " + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }
}
