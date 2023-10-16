/**
 * Hello world!
 *
 */
import contas.cliente.Cliente;
import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaFactory;
import contas.contaBancarias.ContaInvestimento;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Cliente c1 = new Cliente(0, "Felipe V.");


        ContaBancaria cb1 = new ContaFactory().criarBancaria();
        cb1.addCliente(c1);
        cb1.addCliente(new Cliente(1, "José"));
        cb1.setId(2);

        System.out.println(cb1.getId());

        ContaInvestimento ci1 = new ContaFactory().criarInvestimento();
        
        ci1.addCliente(c1);
        ci1.addCliente(new Cliente(1, "José"));

        System.out.println(ci1.getClientes());
    }
}
