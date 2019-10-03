package br.com.alura.banco;

public class TestaConta {
	public static void main(String[] args) {
		Conta joao = new Conta();
		joao.deposita(50.0);
		System.out.println(joao.getSaldo());
		joao.saca(10);
		
	}
}
