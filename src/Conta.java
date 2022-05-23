public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private int agencia;
    private int numero;
    protected Cliente cliente;
    protected Double saldo =0.00;

    private static int SEQUENCIAL = 1;
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
    @Override
    public void sacar(Double valor){
        saldo -= valor;
    }

    @Override
    public void depositar(Double valor){
        saldo += valor;
    }
    @Override
    public void transferir(Conta contaDestino, Double valor){
        this. sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.getAgencia()));
        System.out.println(String.format("Conta: %d", this.getNumero()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
}
