package contas.contaBancarias;

import java.util.HashMap;
import tipos.Investimento;

public class ContaInvestimento extends ContaBancaria{
  
  private HashMap<String,Investimento> listaInvestimentos = new HashMap<String,Investimento>();
  
  @Override
  public void addInvestimento(Investimento i){
    listaInvestimentos.put(i.getId(), i);
  }

  @Override
  public void removeInvestimento(String id){
    listaInvestimentos.remove(id);
  }


  //Somar os lucros de cada invesimento e colocar no saldo
  @Override
  public void calcularLucroMensal(){
    
    float lucro = 0.0f;
    for(Investimento i: listaInvestimentos.values()){
      lucro+=i.getLucroMensal();
    }
    this.saldo+=lucro;
    //return (float)listaInvestimentos.values().stream().mapToDouble(Investimento::getLucroMensal).sum();
  }
  

}
