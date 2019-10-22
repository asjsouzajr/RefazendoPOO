package br.com.alura.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaColecoes {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Mauricio");
		nomes.add("Guilherme");
		nomes.add("Alberto");
		nomes.add("Zé");
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.contains("Guilherme"));

		System.out.println("DESORDENADO");
		for (String nome : nomes) {
			System.out.println(nome);
		}

		Collections.sort(nomes);
		
		System.out.println("ORDENADO");
		for (String nome: nomes) {
			System.out.println(nome);
		}
		
		ArrayList<Conta> contas = new ArrayList<Conta>();

		Conta c1 = new Conta(500.0);
		Conta c2 = new Conta(700.00);

		contas.add(c1);
		contas.add(c2);
		
		for (Conta c : contas) {
			System.out.println(c);
		}

		System.out.println("Ordenado as contas por saldo:");
		Collections.sort(contas);
		for (Conta c : contas) {
			System.out.println(c);
		}
	}
}
