package contas.contaBancarias;

import java.util.ArrayList;

import tipos.Investimento;
import tipos.Transacao;

public abstract class OperacoesBancarias {
	
	public float getTaxaJuros() {return 0.0f;}
  public void setTaxaJuros(float taxaJuros) {return;}
  	
  public ArrayList<Transacao> getlistaTransacoes(){return null;}
    
	public float calcularRendimento() {return 0.0f;}

	public void addInvestimento(Investimento i){ return;}
  public void removeInvestimento(int id){ return;}
  public void calcularLucroMensal(){ return;}
}
