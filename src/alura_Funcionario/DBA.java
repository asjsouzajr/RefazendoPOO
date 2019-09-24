package alura_Funcionario;

public class DBA extends Funcionario {

	@Override
	public double getBonus() {
		return this.salario * 0.1;
	}

}
