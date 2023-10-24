package tipos;


public class Investimento {
  private String id;
  private float lucroMensal; 

  public Investimento(String id,float lucroMensal){
    this.setId(id);
    this.setLucroMensal(lucroMensal);
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public float getLucroMensal() {
    return lucroMensal;
  }
  public void setLucroMensal(float lucroMensal) {
    this.lucroMensal = lucroMensal;
  }
  
}
