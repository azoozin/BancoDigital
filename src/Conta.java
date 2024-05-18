public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 42;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected String titular;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.titular = cliente.getNome();
        this.saldo = 0.0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo - valor < 0) {
            this.saldo = 0;
        } else {
            this.saldo -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo > 0 && this.saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else if (this.saldo > 0 && this.saldo < valor) {
            System.out.println("Saldo da conta inferior ao valor de transferencia.");
        } else {
            // throw new RuntimeException("Transferencia nao pode ser efetuada. Saldo
            // zero.");
            System.out.println("Saldo zero. Nao e possivel efetuar transferencia.");
        }
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.titular));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    // @Override
    // public void imprimirExtrato() {
    // }
}
