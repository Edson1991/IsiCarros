package model;

public class ContaEspecial extends Conta {

	private double limite;
	
	
	/* Regra geral --> Contrutor criado, pois na classe pai CONTA existe construtor, então essa clase "filha" precisa de um constutor tbm
	 * primeira instrução da classe filha é chamar o construtor da classe pai.
	 * E você pode usar o Source - "generate constructor using fields"
	 */
	public ContaEspecial(int numeroConta, String nomeTitular, String cpf, double saldo, double limite) {
		super(numeroConta, nomeTitular, cpf, saldo);
		this.limite = limite;
		
	}
	
	public String toString() {
		return    "****Conta Especial****\n"+
				  "Nome: "+super.nomeTitular+ "\n"+
				  "Numero da Conta: "+super.numeroConta+ "\n"+
				  "CPF: "+super.cpf+ "\n"+
				  "Saldo: "+ String.format("%.2f\n", super.saldo)+
				  "Limite: "+ String.format("%.2f\n", this.limite)+
				  "Valor disponivel: "+ String.format("%.2f\n", saldo+limite);
		}
	
	public boolean debitar (double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = saldo - valor; // "super" quer dizer que o "saldo" vem da classe PAI, mas é opcional utilizá-lo.
		return true;
		}
		return false;
	}
	
	public void creditar (double valor) {
		this.saldo = saldo + valor;
	}	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
}
