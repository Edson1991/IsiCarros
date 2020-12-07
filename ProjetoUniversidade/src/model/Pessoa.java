package model;

/*
 PQ PROTECTED? Para as classes filhas (estudante...) terem acesso aos atributos da classe PESSOA
 */
public class Pessoa {
	protected String nome;     // protected libera o acesso para os filhos da classe Pessoa (conceito de herança)
	protected String email;
	protected String telefone;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
