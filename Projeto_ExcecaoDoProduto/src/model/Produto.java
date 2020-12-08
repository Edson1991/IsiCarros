package model;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws IsiException { // exce��o verificada, obrigatoriamente precisa ter o cabecalho throws
													// se na isiException tive sido feito extends para "RuntimeException", n�o precisaria desse "throws"
													// pois seria uma exce��o n�o verificada 
		if(id<=0) {
			throw new IsiException("ID deve ser positivo"); // lan�ando uma exce��o 
		}
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws IsiException { // exce��o verificada, obrigatoriamente precisa ter o cabecalho throws
														  
		if (nome == null || nome.length()== 0) {
			throw new IsiException("Nome precisa ser preenchido");
		}
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) throws IsiException { // exce��o verificada, obrigatoriamente precisa ter o cabecalho throws
		                                                     
		if(preco < 0) {
			throw new IsiException("Pre�o n�o pode ser negativo");
		}
		this.preco = preco;
	}
	

}
