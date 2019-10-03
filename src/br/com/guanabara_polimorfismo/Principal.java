package br.com.guanabara_polimorfismo;

public class Principal {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		
		c.setIdade(7);
		c.setPeso(17.3f);
		
		c.reagir(false);
		c.reagir("Olá");
		c.reagir(11, 45);
		c.reagir(6,11.3f);
	}
}
