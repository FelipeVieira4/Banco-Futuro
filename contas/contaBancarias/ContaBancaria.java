package contas.contaBancarias;

import java.util.ArrayList;
import java.util.HashMap;

import tipos.TipoConta;
import contas.cliente.Cliente;

public abstract class ContaBancaria implements OperacoesBancarias{

    private HashMap<Integer,Cliente> listaCliente = new HashMap<>();

    private int id;
    protected float saldo;
    private TipoConta tipo;    


    public ArrayList<Cliente> getClientes(){
        return new ArrayList<Cliente>(listaCliente.values());
    }
    public void removeCliente(Integer id){
        listaCliente.remove(id);
    }
    public void addCliente(Cliente c){
        listaCliente.put(c.getId(), c);
    }

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

    
    public Boolean depositar(Float valor) {
        return false;
    }



    public TipoConta getTipo() {
        return tipo;
    }
    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

}