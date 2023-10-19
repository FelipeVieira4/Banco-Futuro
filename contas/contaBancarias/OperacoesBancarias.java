package contas.contaBancarias;

import java.util.ArrayList;
import tipos.Transacao;

public abstract class OperacoesBancarias {
	
	public float getTaxaJuros() {return 0.0f;}
  	public void setTaxaJuros(float taxaJuros) {return;}
  	
    public void calcularLucroMensal(){}
    public ArrayList<Transacao> getlistaTransacoes(){return null;}
    
	public float calcularRendimento() {return 0.0f;}
}
