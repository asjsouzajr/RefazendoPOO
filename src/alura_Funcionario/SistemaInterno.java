package alura_Funcionario;

public class SistemaInterno {
	public void autentica(Autenticavel f) {
		int senha = 123; // futuramente vir� do teclado atrav�s do Scanner
		if (f.autentica(senha)==true) {
			System.out.println("Bem Vindo ao Sistema");
		} else {
			System.out.println("Senha Incorreta");
		}
	}
}
