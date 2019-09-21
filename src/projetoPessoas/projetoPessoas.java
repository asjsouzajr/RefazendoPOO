package projetoPessoas;

public class projetoPessoas {

	public static void main(String[] args) {

		Aluno p1 = new Aluno();
		Professor p2 = new Professor();
		Funcionario p3 = new Funcionario();
		Visitante p4 = new Visitante();
		Bolsista p5 = new Bolsista();

		p1.setNome("Maria");
		p2.setNome("Claudio");
		p3.setNome("Fabiana");
		p4.setNome("José Ribeiro");
		p5.setNome("Raimundo");
		p5.setBolsa(100);

		p1.setCurso("Informática");
		p2.setSalario(2500.00);
		p3.setSetor("Estoque");

		p2.receberAumento(520.00);
		p3.mudarTrabalho();
		p1.cancelarMatr();
		
		p1.pagarMensalidade();
		p5.pagarMensalidade();

		p1.exibirDados();
		p4.exibirDados();
	}
}
