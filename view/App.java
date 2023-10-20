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
        Cliente c1 = new Cliente(0, "Felipe V.");
        System.out.println(c1.setCpf("123.456.789-09"));
        
        c1.criarConta(new ContaCorrenteFactory());
        
        c1.getContasBancarias().get(0).depositar((float)250);
        
        for(Transacao i: c1.getContasBancarias().get(0).getlistaTransacoes()) {
        	System.out.println("Transação:"+i.getDataEspedicao().getTime()+" valor "+i.getValor());
        }

        c1.criarConta(new ContaInvestimentoFactory());
        c1.getContasBancarias().get(1).addInvestimento(new Investimento(0, 250));
        c1.getContasBancarias().get(1).addInvestimento(new Investimento(1, 2500));

        c1.getContasBancarias().get(1).calcularLucroMensal();
        System.out.println("Saldo:"+c1.getContasBancarias().get(1).getSaldo());
    }
}
