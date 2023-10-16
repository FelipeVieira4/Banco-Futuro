/**
 * Hello world!
 *
 */
import contas.cliente.Cliente;
import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaFactory;
import contas.contaBancarias.ContaInvestimento;
import tipos.Investimento;
import tipos.TipoInvestimeto;

public class App 
{
    public static void main( String[] args )
    {
        


        System.out.println( "Hello World!" );
        Cliente c1 = new Cliente(0, "Felipe V.");

        

        //Criar conta bancaria
        ContaBancaria cb1 = new ContaFactory().criarBancaria();
        cb1.addCliente(c1);
        cb1.addCliente(new Cliente(1, "José"));
        cb1.setId(2);

        System.out.println(cb1.getId());


        //Criar investimentos
        Investimento investimento1 = new Investimento(0,TipoInvestimeto.Agricultura,1200);
        Investimento investimento2 = new Investimento(1,TipoInvestimeto.Agricultura,600);
        
        System.out.println(cb1.getClass().getName());


        //Criar conta investimento
        ContaInvestimento ci1 = new ContaFactory().criarInvestimento();
        
        ci1.addInvestimento(investimento1);
        ci1.addInvestimento(investimento2);

        System.out.println(ci1.getClass().getName());


        ci1.addCliente(c1);
        ci1.addCliente(new Cliente(1, "José"));

        System.out.println(ci1.calcularLucroMensal());

    }
}
