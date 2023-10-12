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


        ContaBancaria cb1 = new ContaBancaria();
        cb1.addCliente(c1);
        cb1.addCliente(new Cliente(1, "José"));
        cb1.addCliente(new Cliente(2, "Arthur"));

        System.out.println(cb1.getClientes());
    }
}
