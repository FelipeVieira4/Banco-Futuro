package view;
import AbstractFactory.ContaFactory;
/**
 * Hello world!
 *
 */
import contas.cliente.Cliente;
import contas.contaBancarias.ContaCorrente;
import contas.contaBancarias.ContaInvestimento;
import contas.contaBancarias.ContaPoupanca;
import tipos.Investimento;
import tipos.TipoConta;
import tipos.Transacao;

public class App 
{
    public static void main( String[] args )
    {
        


        System.out.println( "Hello World!" );
        Cliente c1 = new Cliente(0, "Felipe V.");
        System.out.println(c1.setCpf("123.456.789-09"));
        
        //Criar investimentos
        Investimento investimento1 = new Investimento(0,1200);
        Investimento investimento2 = new Investimento(1,600);
        
        new ContaFactory();
		//Criar conta investimento
        ContaInvestimento ci1 = new ContaFactory().criarContaInvestimento();
        
        ci1.addInvestimento(investimento1);
        ci1.addInvestimento(investimento2);
        
        ci1.addCliente(c1);
        ci1.addCliente(new Cliente(1, "José"));

        ci1.calcularLucroMensal();
        ci1.visualizarSaldo();
        
        //Criar conta poupança
        ContaPoupanca cp1 = new ContaFactory().criarContaPoupanca();
        cp1.setTaxaJuros((float)2.5);
        System.out.println("Rendimento:"+cp1.calcularRendimento()); 
        
        //Criar conta corrente
        System.out.println("\n\n -- CORRENTE --");
        
        ContaCorrente cc1 = new ContaFactory().criarContaCorrente();
        cc1.depositar((float)250);
        cc1.saque((float)100);
        for(Transacao i: cc1.getlistaTransacoes()) {
        	System.out.println("Transação:"+i.getDataEspedicao().getTime()+" valor "+i.getValor());
        }
    }
}
