package model;

public class CartaoPrePago {
	
	protected String numeroCartao;
	protected String nomeTitular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;
	
	// Construtor da classe Pai
		public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
			super();
			this.numeroCartao = numeroCartao;
			this.nomeTitular = nomeTitular;
			this.anoValidade = anoValidade;
			this.mesValidade = mesValidade;
			this.saldo = saldo;
		}
	
	
	public String toString() {
		return "***Cartão Pré Pago***\n"+
			   "Nome: "+nomeTitular+ "\n"+
			   "Numero cartão: "+numeroCartao+"\n" +
			   "Mês e Ano validade: "+mesValidade+ "/" +anoValidade+"\n"+
			   "Saldo: "+ String.format("%.2f\n", saldo)+ "\n";
		}	
	
	public void adiconarCredito(double valor) {
		this.saldo = saldo + valor;
	}
	
	public boolean comprar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = saldo - valor;
		return true;
		}
		return false;
	}
	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	
}
