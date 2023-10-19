package contas.contaBancarias;

import tipos.TipoConta;

public class ContaPoupanca extends ContaBancaria{
  
  private float taxaJuros=0.0f;
  
  public ContaPoupanca() {
	  this.setTipo(TipoConta.Poupanca);
  }
  
  
  public float getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(float taxaJuros) {
    this.taxaJuros = taxaJuros;
  }
  
  public float calcularRendimento(){
    return taxaJuros*((float)Math.random()*100);
  }
}
