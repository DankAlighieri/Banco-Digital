public class Main {
    public static void main(String[] args) {
        Cliente guilherme = new Cliente();
        Conta cc = new ContaCorrente(guilherme);
        Conta poupanca = new ContaPoupanca(guilherme);
        Banco banco = new Banco();
        banco.setNome("Banco de Eorzea");
        guilherme.setNome("Guilherme");
//        cc.imprimirExtrato();
//        poupanca.imprimirExtrato();

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        banco.imprimirListaContas();

//        cc.depositar(100);
//        cc.transferir(15, poupanca);
//
//        cc.imprimirExtrato();
//        poupanca.imprimirExtrato();

    }
}
