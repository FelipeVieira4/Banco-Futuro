package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaCorrente;

public class ContaCorrenteFactory implements ContaFactory {
	@Override
	public ContaBancaria criarConta() {
		return new ContaCorrente();
	}
	
	@Override
	public ContaBancaria criarConta(int id, double saldo) {
		return new ContaCorrente(id,saldo);
	}
}
