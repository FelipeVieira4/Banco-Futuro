package contas.contaBancarias;

import java.util.ArrayList;

import tipos.Investimento;
import tipos.Transacao;

/**
  Métodos das Classes que extedem a ContaBancaria.
  Esses métodos são definidos.
**/

public abstract class OperacoesBancarias {
	
  //Métodos da ContaCorrente
  public abstract ArrayList<Transacao> getlistaTransacoes();
    
  //Métodos da ContaPoupança
  public abstract float getTaxaJuros();
  public abstract void setTaxaJuros(float taxaJuros);
  public abstract float calcularRendimento();

  //Métodos da ContaInvestimento
  public abstract void addInvestimento(Investimento i);
  public abstract void removeInvestimento(String id);
  public abstract void calcularLucroMensal();
}