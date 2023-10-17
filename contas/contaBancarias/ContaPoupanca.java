package contas.contaBancarias;

import java.util.Random;

public class ContaPoupanca extends ContaBancaria{
  
  private float taxaJuros=0;


  public float getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(float taxaJuros) {
    this.taxaJuros = taxaJuros;
  }
  
  public float calcularRendimento(){
    return new Random().nextInt(100)*taxaJuros;
  }
}
