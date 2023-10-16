package tipos;


public class Investimento {
  private int id;
  private TipoInvestimeto tipo;
  private float lucroMensal; 

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public TipoInvestimeto getTipo() {
    return tipo;
  }
  public void setTipo(TipoInvestimeto tipo) {
    this.tipo = tipo;
  }
}
