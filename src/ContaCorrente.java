public class ContaCorrente extends Conta {

    private String nomeCliente;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        this.nomeCliente = cliente.getNome();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "Nome Cliente: " + this.nomeCliente +
                " Agencia: " + super.getAgencia() +
                " Numero: " + super.getNumero() +
                " Saldo: " + super.getSaldo();
    }
}
