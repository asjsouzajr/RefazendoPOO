
public class Principal   {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro Cavalcanti", 44, "Masc");
		Livro l1 = new Livro("A volta dos que nao foram", "Joao sem Letras", 128);
		l1.setLeitor(p1);
		l1.abrir();
		l1.folhear(3);
		//l1.detalhes();
		l1.getPagAtual();
		l1.avancarPag();
		l1.getPagAtual();
		l1.fechar();
	}
}