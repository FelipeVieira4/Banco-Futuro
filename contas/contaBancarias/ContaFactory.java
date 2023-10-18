package contas.contaBancarias;

public class ContaFactory {
  
  public ContaBancaria criarContaBancaria(){
    return new ContaBancaria();
  }
  
  public ContaInvestimento criarContaInvestimento(){
    return new ContaInvestimento();
  }

  public ContaPoupanca criarContaPoupanca(){
    return new ContaPoupanca();
  }

  public ContaCorrente criarContaCorrente(){
    return new ContaCorrente();
  }  
}
