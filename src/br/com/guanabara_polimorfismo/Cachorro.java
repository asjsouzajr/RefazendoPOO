package br.com.guanabara_polimorfismo;

public class Cachorro extends Mamifero {
	public void reagir(String frase) {
		if (frase == "Toma Comida"|| frase == "Olá") {
			System.out.println("Abanar o Rabo e latir");
		} else {
			System.out.println("Rosnar");
		}
	}

	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		}  else {
			System.out.println("Abanar e Latir");
		}
	}

	public void reagir(Boolean dono) {	
		if (dono == true) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
		}
	}

	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {				
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
			}
		} if (peso < 10) {
			System.out.println("Rosnar");
		} else {
			System.out.println("Ignorar");
		}
	}
}