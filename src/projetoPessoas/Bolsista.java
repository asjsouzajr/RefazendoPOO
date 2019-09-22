package projetoPessoas;

public class Bolsista extends Aluno {
	private int bolsa;
	public void renovarBolsa() {
		System.out.println("Bolsa de Estudo Renovada!");
	}
	@Override 
	public void pagarMensalidade() {
		System.out.println("Mensalidade do mês paga de "+this.getNome()+" com desconto de "+ this.bolsa+" Reais");
	}
	public int getBolsa() {
		return bolsa;
	}
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
}
