package view;

import AbstractFactory.*;
import contas.cliente.Cliente;
import tipos.Investimento;

public class App 
{
  public static void main( String[] args )
  {

    
    Cliente clienteConta = new Cliente(0, "José Teste");
    System.out.println("Validação CPF é:"+clienteConta.setCpf("123.456.789-09"));
    
    clienteConta.setEmail("test@gmail.com");
    
    //Adicionar uma conta corrente com saldo de 250.0
    clienteConta.criarConta(new ContaCorrenteFactory().criarConta(0,250.0f));
    
    clienteConta.getContasBancarias().get(0).depositar(250.0f);
    clienteConta.getContasBancarias().get(0).sacar(100.0f);
    
    clienteConta.getContasBancarias().get(0).visualizarSaldo();
    
    //Retorna exception
    try{
        clienteConta.getContasBancarias().get(0).setTaxaJuros(250.0f);
    }catch(UnsupportedOperationException e){
        System.out.println("\nOperação não Encontrada não encontrada na Conta\n");
    }

    //Adicionar um conta invesimento
    clienteConta.criarConta(new ContaInvestimentoFactory().criarConta(2,200.0f));
    
    clienteConta.getContasBancarias().get(1).addInvestimento(new Investimento("inv_1_a", 250));
    clienteConta.getContasBancarias().get(1).addInvestimento(new Investimento("inv_2_g", 2500));

    clienteConta.getContasBancarias().get(1).calcularLucroMensal();    
    clienteConta.getContasBancarias().get(1).visualizarSaldo();
  }
}
