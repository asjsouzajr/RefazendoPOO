package br.com.rlSystem_Conta;

public class principal {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
	
		cc.depositar(190);
		cp.depositar(200);
		cc.sacar(50);
		cp.sacar(100);
		cc.extrato();
		cp.extrato();
	}
}
