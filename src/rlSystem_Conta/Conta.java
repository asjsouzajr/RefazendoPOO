package rlSystem_Conta;

public abstract class Conta {
	protected double saldo;
	protected String nome;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void sacar(double valor) {
		if (valor <= this.saldo) {			
			this.saldo -= valor;
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}
	
	public void depositar(double valor) {
		this.saldo +=valor;
		}
	
	
	public void extrato() {
		System.out.printf("Saldo da Conta: R$%.2f\n", this.getSaldo());
		System.out.println("--------------------------------");
	}
}
