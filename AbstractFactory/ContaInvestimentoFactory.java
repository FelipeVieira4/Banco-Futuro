package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaInvestimento;

public class ContaInvestimentoFactory implements ContaFactory{
	@Override
	public ContaBancaria criarConta() {
		return new ContaInvestimento();
	}
	

	@Override
	public ContaBancaria criarConta(int id, double saldo) {
		// TODO Auto-generated method stub
		return new ContaInvestimento(id,saldo);
	}
	
}
