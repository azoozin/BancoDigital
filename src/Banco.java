import java.util.List;
import java.util.ArrayList;

public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Conta> contasCorrente;
    private List<Conta> contasPoupanca;

    private List<Emprestimo> emprestimos;

    public Banco() {
        this.contas = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        this.contasCorrente = new ArrayList<>();
        this.contasPoupanca = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Conta> getContasCorrente() {
        return contasCorrente;
    }

    public List<Conta> getContasPoupanca() {
        return contasPoupanca;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void adicionarContaCorrente(Conta cc) {
        this.contasCorrente.add(cc);
    }

    public void adicionarContaPoupanca(Conta poupanca) {
        this.contasPoupanca.add(poupanca);
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        this.emprestimos.add(emprestimo);
    }

    // -------------------------------------------------------

}
