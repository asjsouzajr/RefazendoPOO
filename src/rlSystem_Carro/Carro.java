package rlSystem_Carro;

public class Carro {
	public String marca;
	public String modelo;
	public int ano;
	private int marcha = 0;
	public boolean ligado;
	public int velocidade;
	public boolean freioDeMao = true;

	public void frear() {
		if (this.ligado == true && this.freioDeMao == false && this.velocidade > 0) {
			this.velocidade -= 20;
			System.out
					.println("O carro " + this.modelo + " foi freiado e nova velocidade é " + this.velocidade + "km/h");
		} else if (this.ligado == true && this.freioDeMao == true) {
			System.out.println("O carro está com o freio de mao puxado!");
			System.out.println("Atual velocidade: " + this.velocidade + "km/h");
		} else if (this.ligado == false && this.freioDeMao == true) {
			System.out.println("O carro já está parado,desligado e com freio de mao puxado!");
		}
	}

	public void soltarFreioDeMao() {
		this.freioDeMao = false;
	}

	public void acionarFreioDeMao() {
		this.freioDeMao = true;
	}

	public void ligar() {
		if (this.ligado == false) {
			this.ligado = true;
			System.out.println("O " + this.modelo + " foi Ligado");
		} else {
			System.out.println("O " + this.modelo + " já está ligado");
		}
	}

	public void desligar() {
		if (this.ligado == true) {
			if(this.velocidade <= 0) {
					System.out.println("Carro desligado!");
				} else {
					System.out.println("Carro ainda em movimento, pare o carro primeiro!");
				}
			} else {
				System.out.println("O carro já está desligado");
			}
				
			
	}

	public void acelerar(int speed) {
		if (this.ligado == true) {
			if (freioDeMao == false) {

				if (this.marcha == 0) {
					System.out.println("O carro está ligado, freio de mao está solto, mas o carro está em ponto morto");

				} else if (this.marcha == 1) {
					if (speed < 30) {
						this.velocidade = speed;
						System.out.println("O " + this.modelo + " foi acelerado à " + this.velocidade + " km/h");
					}
				} else if (this.marcha == 2) {
					if (speed < 50) {
						this.velocidade = speed;
						System.out.println("O " + this.modelo + " foi acelerado à " + this.velocidade + " km/h");
					}
				} else if (this.marcha == 3) {
					if (speed < 80) {
						this.velocidade = speed;
						System.out.println("O " + this.modelo + " foi acelerado à " + this.velocidade + " km/h");
					}
				} else if (this.marcha == 4) {
					if (speed < 100) {
						this.velocidade = speed;
						System.out.println("O " + this.modelo + " foi acelerado à " + this.velocidade + " km/h");
					}
				}
			}
		}
	}

	public void passarMarcha() {
		this.marcha ++;
	}
}
