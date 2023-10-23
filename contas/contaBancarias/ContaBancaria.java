package contas.contaBancarias;

public abstract class ContaBancaria extends OperacoesBancarias{
	
    private int id;
    protected double saldo;
    
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
}