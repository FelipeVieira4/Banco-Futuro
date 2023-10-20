package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaPoupanca;

public class ContaPoupancaFactory implements ContaFactory{
	@Override
	public ContaBancaria criarConta() {
		return new ContaPoupanca();
	}
	
	@Override
	public ContaBancaria criarConta(float saldo) {
		ContaPoupanca newContaPoupanca = new ContaPoupanca();
		newContaPoupanca.setSaldo(saldo);
		return newContaPoupanca;
	}
}
