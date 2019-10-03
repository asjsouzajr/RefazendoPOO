 package br.com.alura.funcionario;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public double getBonus() {
		return this.salario * 0.35;
	}
	public void cobraRelatorios() {
		System.out.println("Preciso dos Relatórios");
	}
	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
