package contas.contaBancarias;

public class ContaFactory {
  
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
