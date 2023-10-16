package contas.contaBancarias;

public interface OperacoesBancarias {
    public void visualizarSaldo();
    public Boolean saque(Float valor);
    public Boolean depositar(Float valor);
}
