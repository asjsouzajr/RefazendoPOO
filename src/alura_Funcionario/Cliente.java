package alura_Funcionario;

public class Cliente implements Autenticavel {
	private String nome;
	private String endereco;
	@Override
	public boolean autentica(int senha) {
		return false;
	}
	
}
