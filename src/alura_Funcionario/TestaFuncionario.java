package alura_Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {

		Gerente joaquim = new Gerente();
		joaquim.setSalario(2000.0);
		joaquim.cobraEntrega();
		System.out.println(joaquim.getBonus());

		/*Desenvolvedor eu = new Desenvolvedor();
		eu.setSalario(1500.00);
		System.out.println(eu.getBonus());*/
		
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joaquim);
		
		System.out.println(totalizador.getTotal());
	}
}
