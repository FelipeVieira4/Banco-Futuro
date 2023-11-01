package contas.contaBancarias;

import java.util.ArrayList;
import java.util.Calendar;

import tipos.TipoConta;
import tipos.Transacao;

public class ContaCorrente extends ContaBancaria{
  private ArrayList<Transacao> listaTransacoes = new ArrayList<Transacao>();
  
  public ContaCorrente() {
	  super.setTipo(TipoConta.Corrente);
  }
  
  public ContaCorrente(int id){
	  super(id);
	  super.setTipo(TipoConta.Corrente);
  }
  
  public ContaCorrente(int id,double saldo){
	  super(id,saldo);
	  super.setTipo(TipoConta.Corrente);
  }
  
  @Override
  public void depositar(double valor){
    super.depositar(valor);

    Calendar horario = Calendar.getInstance();  

    Transacao transacao = new Transacao("Depósito",(float)valor, horario);
    listaTransacoes.add(transacao);
  }

  @Override
  public Boolean sacar(double valor){

    if (valor <= this.getSaldo()) {
      super.sacar(valor);
      
      Calendar horario = Calendar.getInstance();
      Transacao transacao = new Transacao("Saque", (float)-valor,horario);
      listaTransacoes.add(transacao);
      return true;
    } else {
      System.out.println("Saldo insuficiente");
    }
    return false;
  }

  //Puxar lista de transações da conta
  public ArrayList<Transacao> getlistaTransacoes(){
    return this.listaTransacoes;
  }
  
  @Override
  public void visualizarSaldo() {
	System.out.println("\n---Saldo da conta corrente é:--- ");
	for(Transacao i: this.getlistaTransacoes()) {
	  System.out.println("Transação:"+i.getDataEspedicao().getTime()+" valor "+i.getValor());
	}
	System.out.println("Saldo total:"+this.getSaldo());
  }
}
