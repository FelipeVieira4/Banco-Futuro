package view;

/**
 * Hello world!
 *
 */
import AbstractFactory.*;
import contas.cliente.Cliente;
import tipos.Investimento;
import tipos.Transacao;

public class App 
{
    public static void main( String[] args )
    {
        


        System.out.println( "Hello World!" );
        Cliente clienteTest = new Cliente(0, "José Teste");
        System.out.println(clienteTest.setCpf("123.456.789-09"));
        
        clienteTest.criarConta(new ContaCorrenteFactory());
        
        clienteTest.getContasBancarias().get(0).depositar((float)250);
        clienteTest.getContasBancarias().get(0).saque((float)100);
        
        for(Transacao i: clienteTest.getContasBancarias().get(0).getlistaTransacoes()) {
        	System.out.println("Transação:"+i.getDataEspedicao().getTime()+" valor "+i.getValor());
        }

        clienteTest.criarConta(new ContaInvestimentoFactory());
        clienteTest.getContasBancarias().get(1).addInvestimento(new Investimento(0, 250));
        clienteTest.getContasBancarias().get(1).addInvestimento(new Investimento(1, 2500));

        clienteTest.getContasBancarias().get(1).calcularLucroMensal();
        System.out.println("Saldo:"+clienteTest.getContasBancarias().get(1).getSaldo());
    }
}
