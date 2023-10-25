package contas.contaBancarias;

import java.util.ArrayList;
import java.util.Calendar;
import tipos.Transacao;

public class ContaCorrente extends ContaBancaria{
  private ArrayList<Transacao> listaTransacoes = new ArrayList<Transacao>();
  
  @Override
  public void depositar(double valor){
    this.saldo += valor;

    Calendar horario = Calendar.getInstance();  

    Transacao transacao = new Transacao("Depósito",(float)valor, horario);
    listaTransacoes.add(transacao);
  }

  @Override
  public Boolean sacar(double valor){

    if (valor <= saldo) {
      this.saldo -= valor;
      
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
  }
}
