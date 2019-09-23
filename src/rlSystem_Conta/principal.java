package rlSystem_Conta;

public class principal {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depositar(190.0);
		cc.sacar(50);
		cp.depositar(200);
		cp.sacar(100.0);
		cc.extrato();
		cp.extrato();
	}
}
