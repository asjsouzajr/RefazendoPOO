package br.com.rlSystem_Conta;

public final class ContaCorrente extends Conta {
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		this.juro();
	}
	private void juro() {
		this.saldo -=1;
	}
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}
}
