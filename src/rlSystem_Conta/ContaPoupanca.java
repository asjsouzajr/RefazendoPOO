package rlSystem_Conta;

public class ContaPoupanca extends Conta {
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor + 0.20);
		if (valor > 100) {
			System.out.println("Poupe hoje e garanta um futuro melhor!!!");
		}
	}
	
}
