package br.com.alura.funcionario;

public class DBA extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}

}
