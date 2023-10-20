package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaCorrente;

public class ContaCorrenteFactory implements ContaFactory {
	@Override
	public ContaBancaria criarConta() {
		return new ContaCorrente();
	}
	
	@Override
	public ContaBancaria criarConta(float saldo) {
		ContaCorrente newContaCorrente = new ContaCorrente();
		newContaCorrente.setSaldo(saldo);
		return newContaCorrente;
	}
}
