public abstract class Conta implements IConta{
    private final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        try {
            saldo -= valor;
            System.out.println(String.format("Foi sacado %.2f a conta %d", valor, this.numero));
        }
        catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void depositar(double valor) {
        try {
            saldo += valor;
            System.out.println(String.format("Foi depositado %.2f da conta %d", valor, this.numero));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println(String.format("Foi transferido %.2f da conta %d para a conta %d", valor, this.numero, contaDestino.numero));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
