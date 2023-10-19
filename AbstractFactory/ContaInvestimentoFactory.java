package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaInvestimento;

public class ContaInvestimentoFactory implements ContaFactory{
	public ContaBancaria criarConta() {
		return new ContaInvestimento();
	}
}
