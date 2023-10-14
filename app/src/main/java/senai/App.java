package com.senai.app;

/**
 * Hello world!
 *
 */
import com.senai.contas.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Cliente c1 = new Cliente(0, "Felipe V.");


        ContaBancaria cb1 = new ContaFactory().criarBancaria();
        cb1.addCliente(c1);
        cb1.addCliente(new Cliente(1, "José"));

        System.out.println(cb1.getClientes());

        ContaInvestimento ci1 = new ContaFactory().criarInvestimento();
        ci1.addCliente(c1);
        ci1.addCliente(new Cliente(1, "José"));

        System.out.println(ci1.getClientes());
    }
}
