package br.com.rlSystem_Carro;

public class main {

	public static void main (String[] args) {
		Carro carro1 = new Carro();
		
		Carro carro2 = new Carro();
		
		carro2.marca = "Hyundai";
		carro2.modelo = "iX35";
		carro2.ano = 2017;
		carro2.ligar();
		carro2.soltarFreioDeMao();
		
		carro2.passarMarcha();
		carro2.acelerar(20);
		
		carro2.passarMarcha();
		carro2.acelerar(40);
		
		carro2.passarMarcha();
		carro2.acelerar(60);

		carro2.passarMarcha();
		carro2.acelerar(90);
		
        carro2.frear();
		carro2.desligar();
		carro2.frear();
		carro2.frear();
		carro2.frear();
		carro2.frear();
		
		carro2.desligar();
	}
}
