package com.senai.contas;

import java.util.ArrayList;

public class ContaBancaria implements OperacoesBancarias{

    private ArrayList<Cliente> clientes;
    private int id;
    private float saldo;

    public ContaBancaria(){
        clientes=new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }

    public void addCliente(Cliente c){
        clientes.add(c);
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

}