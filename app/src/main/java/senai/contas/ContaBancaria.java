package com.senai.contas;

import java.util.ArrayList;

import com.senai.tipos.TipoConta;

public class ContaBancaria implements OperacoesBancarias{

    private ArrayList<Cliente> clientes=new ArrayList<Cliente>();
    private int id;
    private float saldo;
    private TipoConta tipo;    

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