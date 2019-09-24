package guanabara_projetoPessoas;

public class projetoPessoas {

	public static void main(String[] args) {

		Aluno a1 = new Aluno();
		Professor p2 = new Professor();
		Funcionario f3 = new Funcionario();
		Visitante v4 = new Visitante();
		Bolsista b5 = new Bolsista();

		a1.setNome("Maria");
		a1.setIdade(22);
		a1.setSexo("fem");
		a1.setCurso("Ciencia da Computacao");
		a1.setMatricula(273487384);;
		a1.fazerAniv();
		p2.setNome("Claudio");
		f3.setNome("Fabiana");
		v4.setNome("José Ribeiro");
		b5.setNome("Raimundo");
		b5.setBolsa(100);

		p2.setSalario(2500.00);
		f3.setSetor("Estoque");

		p2.receberAumento(520.00);
		f3.mudarTrabalho();
		a1.cancelarMatr();
		
		a1.pagarMensalidade();
		b5.pagarMensalidade();

		a1.exibirDados();
		v4.exibirDados();
	}
}
