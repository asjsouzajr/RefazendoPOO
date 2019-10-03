package br.com.alura.funcionario;

public abstract class Funcionario {
	protected double salario;
	public abstract double getBonus();
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
