package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaPoupanca;

public class ContaPoupancaFactory implements ContaFactory{
	@Override
	public ContaBancaria criarConta() {
		return new ContaPoupanca();
	}
	
	@Override
	public ContaBancaria criarConta(int id, double saldo) {
		return new ContaPoupanca(id,saldo);
	}
}
