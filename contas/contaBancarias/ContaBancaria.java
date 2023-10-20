package contas.contaBancarias;

public abstract class ContaBancaria extends OperacoesBancarias{
	
    private int id;
    protected float saldo;
    
    //Métodos construtores
    public ContaBancaria(){}
    
    public ContaBancaria(float saldo) {
    	this.saldo=saldo;
    }
    
    //Getters e Setters
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public void visualizarSaldo() {
        System.out.println("Saldo:"+this.saldo);
        return;        
    }


    public Boolean saque(Float valor) {
        return false;
    }

    
    public void depositar(Float valor) {
        return;
    }
   
}