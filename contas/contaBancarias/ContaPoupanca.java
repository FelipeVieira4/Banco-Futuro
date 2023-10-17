package contas.contaBancarias;

public class ContaPoupanca extends ContaBancaria{
  
  private float taxaJuros=0;


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
