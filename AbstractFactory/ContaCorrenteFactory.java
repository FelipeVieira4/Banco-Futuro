package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
import contas.contaBancarias.ContaCorrente;

public class ContaCorrenteFactory implements ContaFactory {
	public ContaBancaria criarConta() {
		return new ContaCorrente();
	}
}
