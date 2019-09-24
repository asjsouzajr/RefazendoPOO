package alura_Funcionario;

public class Gerente extends Funcionario implements Autenticavel{

	@Override
	public double getBonus() {
		return this.salario * 0.3;
	}
	public void cobraEntrega() {
		System.out.println("Está pronto?");
	}
	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
}
