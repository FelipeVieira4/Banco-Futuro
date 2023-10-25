package AbstractFactory;

import contas.contaBancarias.ContaBancaria;
public interface ContaFactory {
	public ContaBancaria criarConta();
	public ContaBancaria criarConta(int id,double saldo);
}
