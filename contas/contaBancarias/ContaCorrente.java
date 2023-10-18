package contas.contaBancarias;

import java.util.ArrayList;
import java.util.Calendar;

import tipos.Transacao;

public class ContaCorrente extends ContaBancaria{
  private ArrayList<Transacao> transacoes;

  public void depositar(double valor) {
    this.saldo += valor;


    Calendar data = Calendar.getInstance();  

    Transacao transacao = new Transacao("Depósito",(float)valor, data);
    transacoes.add(transacao);
  }

  public void sacar(double valor) {
      if (valor <= saldo) {
          this.saldo -= valor;

          Calendar data = Calendar.getInstance();
          Transacao transacao = new Transacao("Saque", (float)-valor,data);
          transacoes.add(transacao);
      } else {
          System.out.println("Saldo insuficiente");
      }
  }

  public ArrayList<Transacao> getTransacoes(){
    return this.transacoes;
  }
}
