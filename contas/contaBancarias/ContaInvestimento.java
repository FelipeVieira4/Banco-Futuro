package contas.contaBancarias;

import java.util.HashMap;
import tipos.Investimento;
import tipos.TipoConta;

public class ContaInvestimento extends ContaBancaria{
  
  private HashMap<String,Investimento> listaInvestimentos = new HashMap<String,Investimento>();
  
  public ContaInvestimento() {
	  super.setTipo(TipoConta.Investimento);
  }
  
  public ContaInvestimento(int id){
	  super(id);
	  super.setTipo(TipoConta.Investimento);
  }
  
  public ContaInvestimento(int id,double saldo){
	  super(id,saldo);
	  super.setTipo(TipoConta.Investimento);
  }
  
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
    super.depositar(lucro);
    //return (float)listaInvestimentos.values().stream().mapToDouble(Investimento::getLucroMensal).sum();
  }
  
  @Override
  public void visualizarSaldo() {
      System.out.println("Saldo da conta Investimento é: ");
      for(Investimento i: listaInvestimentos.values()){
    		System.out.println("Investimento:"+i.getId()+" lucro:"+i.getLucroMensal());
      }
      System.out.println("Lucro da conta "+this.getId()+" é R$"+this.getSaldo());
  }
}
