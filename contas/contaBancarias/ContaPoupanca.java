package contas.contaBancarias;

import tipos.TipoConta;

public class ContaPoupanca extends ContaBancaria{
  
  private float taxaJuros=0.0f;
  
  public ContaPoupanca() {
	  super.setTipo(TipoConta.Poupanca);
  }
  
  public ContaPoupanca(int id){
	  super(id);
	  super.setTipo(TipoConta.Poupanca);
  }
  
  public ContaPoupanca(int id,double saldo){
	  super(id,saldo);
	  super.setTipo(TipoConta.Poupanca);
  }
  
  @Override
  public float getTaxaJuros() {
    return taxaJuros;
  }

  @Override
  public void setTaxaJuros(float taxaJuros) {
    this.taxaJuros = taxaJuros;
  }
  
  @Override
  public float calcularRendimento(){
    return taxaJuros*((float)Math.random()*100);
  }

  @Override
  public void visualizarSaldo() {
      System.out.println("\n---Saldo da conta Pupança é:--- "+(taxaJuros + this.getSaldo()));
       
      
  }

}
