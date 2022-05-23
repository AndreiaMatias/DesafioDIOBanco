public class Main {

    public static void main(String[] args) {
        Cliente andreia = new Cliente();
        andreia.setNome("Andreia");

        Conta cc = new ContaCorrente(andreia);
        Conta poupanca = new ContaPoupanca(andreia);

        cc.depositar(200d);
        cc.transferir(poupanca, 100d);
        cc.imprimirExtrato();
        System.out.println();
        System.out.println();
        poupanca.imprimirExtrato();
    }

}
