package contas.contaBancarias;

import java.util.ArrayList;

import tipos.Investimento;
import tipos.TipoConta;
import tipos.Transacao;

public abstract class ContaBancaria extends OperacoesBancarias{
	
  private int id;
  private double saldo;

  private TipoConta tipo=TipoConta.Indefinida;
  
  //Métodos construtores
  public ContaBancaria(){}

  public ContaBancaria(int id) {
    this.setId(id);
  }
  
  public ContaBancaria(int id,double saldo) {
	this.setId(id);
	this.setSaldo(saldo);
  }
    
  //Getters e Setters
  
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }


  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }


  public void visualizarSaldo() {
    System.out.println("Saldo:"+this.saldo);
    return;        
  }

  public Boolean sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo -= valor;
      System.out.println("Saque de R$" + valor + ".");
      return true;
    } else {
      System.out.println("Saldo insuficiente ou valor inválido.");
      return false;
    }
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito de R$" + valor + ".");
    } else {
      System.out.println("Valor de depósito inválido.");
    }
  }

  public void transferir(ContaBancaria destino, double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo -= valor;
      destino.depositar(valor);
      System.out.println("Transferência de R$" + valor + " para a conta de " + destino.getId() + ".");
    } else {
      System.out.println("Saldo insuficiente ou valor inválido.");
    }
  }

  public void pagamento(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo -= valor;
      System.out.println("Pagamento de R$" + valor + "realizado.");
    } else {
      System.out.println("Saldo insuficiente ou valor inválido.");
    }
  }
  
  
  public TipoConta getTipo() {return tipo;}
  public void setTipo(TipoConta tipo) {this.tipo = tipo;}

  //Métodos reescritos para retornar erro
  
  @Override
  public ArrayList<Transacao> getlistaTransacoes() {return null;}
  
  @Override
  public void addInvestimento(Investimento i) {return;}
  
  @Override
  public void removeInvestimento(String id) {return;}
  
  @Override
  public void calcularLucroMensal() {return;}
  
  @Override
  public float getTaxaJuros() {return 0;}
  
  @Override
  public void setTaxaJuros(float taxaJuros) {}
  
  @Override
  public float calcularRendimento() {return 0;} 

}