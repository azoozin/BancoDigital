// import java.util.Map;
// import java.util.HashMap;

public class Emprestimo {

    private double valorEmprestimo;
    private Cliente cliente;

    private double divida;

    public Emprestimo(Cliente cliente) {
        this.cliente = cliente;
        this.divida = 0.0;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getDivida() {
        return divida;
    }

    // metodo de transferencia de valor emprestado
    // privado
    private void transferirValorEmprestimo(double valorEmprestimo, Conta contaDestino) {
        // this.valorEmprestimo = valorEmprestimo;
        contaDestino.depositar(valorEmprestimo);
    }

    public void criarEmprestimo(double valorEmprestimo, Conta contaCliente, Cliente cliente) {
        Emprestimo novoEmprestimo = new Emprestimo(cliente);
        novoEmprestimo.transferirValorEmprestimo(valorEmprestimo, contaCliente);
        this.valorEmprestimo = valorEmprestimo;
        this.divida = valorEmprestimo;
    }

    public void pagarDivida(double pagamento, Conta conta) {
        conta.sacar(pagamento);
        if (this.divida - pagamento < 0) {
            this.divida = 0;
        } else {
            this.divida -= pagamento;
        }
    }

    public void imprimirEmprestimo() {
        System.out.println("=== Informacoes Emprestimo ===");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Valor Emprestimo: %.2f", this.valorEmprestimo));
        System.out.println(String.format("Valor Divida: %.2f", this.divida));
    }

    // @Override
    // public String toString() {
    // return "Cliente: " + this.cliente.getNome() +
    // " Valor emprestimo feito: " + this.valorEmprestimo +
    // " Valor divida: " + this.divida;
    // }

    /*
     * TODO:
     * 
     * fazer disto um interface e implementar em Banco?
     * 
     * Atributos:
     * Map <Conta do cliente, valor divida (talvez adicioanr isto a class Banco)
     * valor divida/emprestimo (com valor limite, recusa se pedir maior q x)
     * 
     * func transferir valor emprestado para conta do cliente
     * func pagar emprestimo
     * get cliente e sua divida
     * 
     * adicionar a class cliente func de print de info de divida/emprestimo
     * 
     */

}
