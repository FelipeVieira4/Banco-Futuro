package contas.contaBancarias;

public class ContaFactory {
  
  public ContaInvestimento criarContaInvestimento(){
    return new ContaInvestimento();
  }

  public ContaBancaria criarContaBancaria(){
    return new ContaBancaria();
  }

  public ContaPoupanca criarContaPoupanca(){
    return new ContaPoupanca();
  }  
}
