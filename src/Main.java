public class Main {
    public static void main(String[] args) throws Exception {
        Cliente client = new Cliente();
        client.setNome("ClientOne");

        Conta cc = new ContaCorrente(client);
        Conta poupanca = new ContaPoupanca(client);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
