package tipos;

import java.util.Calendar;

public class Transacao {
  private String descricao;
  private float valor;
  private Calendar dataEspedicao;
  
  public Transacao(String desc, float valor, Calendar date){
    this.setDescricao(desc);
    this.setValor(valor);
    this.setDataEspedicao(date);
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public float getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public Calendar getDataEspedicao() {
    return dataEspedicao;
  }

  public void setDataEspedicao(Calendar pdataEspedicao) {
    this.dataEspedicao = pdataEspedicao;
  }

  
}
