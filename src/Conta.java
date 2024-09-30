public class Conta implements IConta {

  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int conta;
  protected double saldo;
  protected double valor;

  public Conta(){
    this.agencia = Conta.AGENCIA_PADRAO;
    this.conta = SEQUENCIAL++;

  }

  @Override
  public void depositar(double valor) {
    saldo += valor;

  }
  @Override
  public void sacar(double valor) {
    saldo -= valor;
 
  }
  @Override
  public void transferir(double valor, IConta contaDestino) {
  this.sacar(valor);
  contaDestino.depositar(valor);
   
  }
  @Override
  public void imprimirExtrato(){};
  
  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getNumero() {
    return conta;
  }

  public void setNumero(int conta) {
    this.conta = conta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  protected void imprimirInfosComuns() {
    System.out.println(String.format("Agencia: %d", agencia));
    System.out.println(String.format("Conta: %d", conta));
    System.out.println(String.format("Saldo: %.2f", saldo));
  }

  
}
