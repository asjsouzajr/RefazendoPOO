package alura_Banco;

	import java.text.DecimalFormat;

public class Conta {
		private double saldo;
		private String titular;
		private int agencia;
		private int numero;

		private static DecimalFormat df = new DecimalFormat("#.00");

		public void saca(double valor) {
				if (valor <= this.saldo) {
					this.saldo -= valor;
					System.out.println("Saque efetuado com sucesso");
					System.out.println("Valor sacado: R$" + df.format(valor));
					System.out.println("Novo Saldo: R$" + df.format(this.getSaldo()));
				} else {
				System.out.println("Saldo Insuficiente");
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
}
