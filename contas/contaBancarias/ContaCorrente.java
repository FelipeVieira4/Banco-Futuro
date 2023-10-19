package contas.contaBancarias;

import java.util.ArrayList;
import java.util.Calendar;
import tipos.Transacao;

public class ContaCorrente extends ContaBancaria{
  private ArrayList<Transacao> listaTransacoes = new ArrayList<Transacao>();
  
  @Override
  public void depositar(Float valor){
    this.saldo += valor;


    Calendar horario = Calendar.getInstance();  

    Transacao transacao = new Transacao("Depósito",(float)valor, horario);
    listaTransacoes.add(transacao);
  }

  @Override
  public Boolean saque(Float valor){

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

  public ArrayList<Transacao> getlistaTransacoes(){
    return this.listaTransacoes;
  }
}
