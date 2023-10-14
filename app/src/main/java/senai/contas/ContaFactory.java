package com.senai.contas;

public class ContaFactory {
  
  public ContaInvestimento criarInvestimento(){
    return new ContaInvestimento();
  }

  public ContaBancaria criarBancaria(){
    return new ContaBancaria();
  }

  
}
