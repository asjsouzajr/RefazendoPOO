package br.com.alura.funcionario;

public class SistemaInterno {
	public void autentica(Autenticavel f) {
		int senha = 123; // futuramente virá do teclado através do Scanner
		if (f.autentica(senha)==true) {
			System.out.println("Bem Vindo ao Sistema");
		} else {
			System.out.println("Senha Incorreta");
		}
	}
}
