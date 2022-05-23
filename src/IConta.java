public interface IConta {
    void imprimirExtrato();

    void sacar(Double valor);

    void depositar(Double valor);

    void transferir(Conta contaDestino, Double valor);
}
