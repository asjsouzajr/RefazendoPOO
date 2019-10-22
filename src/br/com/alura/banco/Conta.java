package br.com.alura.banco;

	import java.text.DecimalFormat;

public class Conta implements Comparable<Conta>{
		private double saldo;
		private String titular;
		private int agencia;
		private int numero;

		private static DecimalFormat df = new DecimalFormat("#.00");
		
		public Conta() {
			super();
		}

		public Conta(double saldo) {
			super();
			this.saldo = saldo;
		}



		/**
		 * Realiza um saque
		 * @param valor a ser sacado.
		 */
		public void saca(double valor) {
				if (valor <= this.saldo) {
					this.saldo -= valor;
					System.out.println("Saque efetuado com sucesso");
					System.out.println("Valor sacado: R$" + df.format(valor));
					System.out.println("Novo Saldo: R$" + df.format(this.getSaldo()));
				} else {
					throw new RuntimeException("Saldo Insuficiente!\\nSaldo Disponível: R$\"+df.format(this.getSaldo()));");
					//Sem usar o throw :
					//System.out.println("Saldo Insuficiente!\nSaldo Disponível: R$"+df.format(this.getSaldo()));
				}
		}

		public void deposita(double valor) {
			this.saldo += valor;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
		@Override
		public String toString() {
		return "Conta com Saldo "+getSaldo();
		}

		@Override
		public int compareTo(Conta outraConta) {
			if(this.saldo < outraConta.saldo) return -1;
			if(this.saldo > outraConta.saldo) return 1;
			return 0;
		}
}
