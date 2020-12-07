package model;

//o operador EXTENDS (ampliar/estender) pode ser lido como:
// A classe ESTUDANTE possui tudo que tem na classe PESSOA mais as suas informações especificas.

public class Estudante extends Pessoa {
	private String curso;
	private int    numMatricula;
	
	public String exibirInfo() {
		String resultado = "Nome: "+nome+ "\n"+
						   "Telefone: "+telefone+ "\n"+
						   "E-mail: "+email+ "\n" +
						   "Curso: "+curso+ "\n" +
						   "Numero Matricula: "+numMatricula+ "\n";
		return resultado;
		}	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	
}
