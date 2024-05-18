public class ContaPoupanca extends Conta {

    private String nomeCliente;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.nomeCliente = cliente.getNome();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
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
