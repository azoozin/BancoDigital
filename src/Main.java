public class Main {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();

        Cliente client = new Cliente();
        client.setNome("ClientOne");

        Conta cc = new ContaCorrente(client);
        banco.adicionarContaCorrente(cc);
        Conta poupanca = new ContaPoupanca(client);
        banco.adicionarContaPoupanca(poupanca);
        Emprestimo emp = new Emprestimo(client);

        Cliente client2 = new Cliente();
        client2.setNome("ClientTwo");

        Conta cc2 = new ContaCorrente(client2);
        banco.adicionarContaCorrente(cc2);
        Conta poupanca2 = new ContaPoupanca(client2);
        banco.adicionarContaPoupanca(poupanca2);
        Emprestimo emp2 = new Emprestimo(client2);

        // cc.depositar(100);
        // cc.transferir(100, poupanca);

        // cc.imprimirExtrato();
        // poupanca.imprimirExtrato();

        emp.criarEmprestimo(1000, cc, client);
        banco.adicionarEmprestimo(emp);

        emp2.criarEmprestimo(5555, cc2, client2);
        banco.adicionarEmprestimo(emp2);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc2.imprimirExtrato();
        poupanca2.imprimirExtrato();

        // banco.imprimirEmprestimos();
        System.out.println("*****************");
        System.out.println(banco.getContasCorrente());
        System.out.println(banco.getContasPoupanca());
        System.out.println(banco.getEmprestimos());

        System.out.println("**********************");
        emp.pagarDivida(50, cc);
        System.out.println(banco.getContasCorrente());
        System.out.println(banco.getContasPoupanca());
        System.out.println(banco.getEmprestimos());

        // TODO:
        //
        // Adicionar loop de interface para o banco e suas funcionalidades
    }
}
