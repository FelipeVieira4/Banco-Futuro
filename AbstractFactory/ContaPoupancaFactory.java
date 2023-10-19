package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaPoupanca;

public class ContaPoupancaFactory implements ContaFactory{
	@Override
	public ContaBancaria criarConta() {
		// TODO Auto-generated method stub
		return new ContaPoupanca();
	}
}
