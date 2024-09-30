public class Main {
    public static void main(String[] args) throws Exception {
        IConta cc = new ContaCorrente();
        IConta cp = new ContaPoupanca();

        cc.depositar(100);
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
