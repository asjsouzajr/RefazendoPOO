package guanabara_livraria;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto = false;
	private Pessoa leitor;
	
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	public Livro(String titulo, String autor, int totPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public void detalhes() {
		System.out.println("Título do Livro: "+this.getTitulo());
		System.out.println("Autor: "+this.getAutor());
		System.out.println("Total de Páginas: "+this.getPagAtual());
		
	}
	@Override
	public void abrir() {
		if (this.isAberto()==false) {
			this.setAberto(true);
			this.pagAtual = 1;
		} else {
			System.out.println("Livro já se encontra aberto na página: "+this.getPagAtual());
		}
	}
	@Override
	public void fechar() {
		if (isAberto()==false) {
			this.setAberto(true);
		} else {
			System.out.println("Livro já se encontra fechado");
		}
	}

	@Override
	public void avancarPag() {
		if (this.aberto == true) {
			this.setPagAtual(this.getPagAtual() + 1); 
		} else {
			System.out.println("O livro está fechado");
		}
	}
	@Override
	public void voltarPag() {
		if (this.aberto == true) {
			this.setPagAtual(this.getPagAtual() - 1); 
		} else {
			System.out.println("O livro está fechado");
		}
	}
	@Override
	public void folhear(int pag) {
		if (this.aberto == true) {
			this.setPagAtual(pag); 
		} else {
			System.out.println("O Livro está fechado");
		}
	}
}
