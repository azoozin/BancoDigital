public class Main {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();

        Cliente client = new Cliente("ClientOne");
        Conta cc = new ContaCorrente(client);
        banco.adicionarContaCorrente(cc);
        Conta poupanca = new ContaPoupanca(client);
        banco.adicionarContaPoupanca(poupanca);
        Emprestimo emp = new Emprestimo(client);

        /*
         * TODO:
         * 
         * Adicionar class UI
         * Fazer listas ContaCorrente e Poupanca de class Banco em Sets
         * Verificar se conta ja existe e negar ciracao de uma nova no nome do titular
         * 
         */
    }
}
