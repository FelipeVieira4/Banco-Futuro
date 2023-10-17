package tipos;


public class Investimento {
  private int id;
  private float lucroMensal; 

  public Investimento(int id,float lucroMensal){
    this.setId(id);
    this.setLucroMensal(lucroMensal);
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public float getLucroMensal() {
    return lucroMensal;
  }
  public void setLucroMensal(float lucroMensal) {
    this.lucroMensal = lucroMensal;
  }
  
}
