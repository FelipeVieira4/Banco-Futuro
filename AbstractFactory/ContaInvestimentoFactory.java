package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaInvestimento;

public class ContaInvestimentoFactory implements ContaFactory{
	@Override
	public ContaBancaria criarConta() {
		return new ContaInvestimento();
	}
	
	@Override
	public ContaBancaria criarConta(float saldo) {
		ContaInvestimento newContaInvestimento = new ContaInvestimento();
		newContaInvestimento.setSaldo(saldo);
		return newContaInvestimento;
	}
	
}
