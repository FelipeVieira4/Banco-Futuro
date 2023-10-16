package contas.contaBancarias;

public class ContaFactory {
  
  public ContaInvestimento criarInvestimento(){
    return new ContaInvestimento();
  }

  public ContaBancaria criarBancaria(){
    return new ContaBancaria();
  }

  
}
