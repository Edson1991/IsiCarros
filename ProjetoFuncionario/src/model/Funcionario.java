package model;

public abstract class Funcionario {
	
	protected String Nome;
	protected int numeroRegistro;
	
	
	// Metodo abstrato na clase pai
	public abstract double calcularSalario();
	
	
	// metodo construtor da classe Pai
	public Funcionario(String nome, int numeroRegistro) {
		super();
		Nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	
	
	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public int getNumeroRegistro() {
		return numeroRegistro;
	}


	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}	

}
