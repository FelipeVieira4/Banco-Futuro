package contas.contaBancarias;

import java.util.HashMap;

import tipos.Investimento;

public class ContaInvestimento extends ContaBancaria{
  
  private HashMap<Integer,Investimento> listaInvestimentos = new HashMap<Integer,Investimento>();

  public void addInvestimento(Investimento i){
    listaInvestimentos.put(i.getId(), i);
  }

  public void removeInvestimento(int id){
    listaInvestimentos.remove(id);
  }

  public void calcularLucroMensal(){
    
    float lucro = 0.0f;
    for(Investimento i: listaInvestimentos.values()){
      lucro+=i.getLucroMensal();
    }
    this.saldo+=lucro;
    //return (float)listaInvestimentos.values().stream().mapToDouble(Investimento::getLucroMensal).sum();
  }
  

}
