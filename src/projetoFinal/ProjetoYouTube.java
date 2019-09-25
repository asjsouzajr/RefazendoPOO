package projetoFinal;

public class ProjetoYouTube {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula POO 01");
		v[1] = new Video("Aula 12 PHP");
		v[2] = new Video("Aula Javascript 07");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Junior", 44, "masc", "1234");
		g[1] = new Gafanhoto("Paula", 33, "fem", "4321");
		
		System.out.println(v[0].toString());
		System.out.println(g[0].toString());
	}
}
