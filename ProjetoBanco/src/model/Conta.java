package model;

public class Conta {
	
	protected int numeroConta;
	protected String nomeTitular;
	protected String cpf;	
	protected double saldo;
	
	/*Metodo "toString" é nativa do java (classe "Object"), você não precisa criar um metodo "exibir resultado", 
	basta alterar o formato	de apresentação do metodo "toString" como quiser.
	*/
	
	//Contrutor do CONTA --> esse é o contrutor PAI
	public Conta(int numeroConta, String nomeTitular, String cpf, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	
	public String toString() {
		return "***Conta Normal***\n"+
			   "Nome: "+nomeTitular+ "\n"+
			   "CPF: "+cpf+ "\n"+
			   "Numero da Conta: "+numeroConta+ "\n" +
			   "Saldo: "+ String.format("%.2f\n", saldo)+ "\n";
		}
	

	public boolean debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = saldo - valor;
		return true;
		}
		return false;
	}
	
	public void creditar (double valor) {
		this.saldo = saldo + valor;
	}	
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}
