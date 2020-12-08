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
	public void setId(int id) throws IsiException { // exceção verificada, obrigatoriamente precisa ter o cabecalho throws
													// se na isiException tive sido feito extends para "RuntimeException", não precisaria desse "throws"
													// pois seria uma exceção não verificada 
		if(id<=0) {
			throw new IsiException("ID deve ser positivo"); // lançando uma exceção 
		}
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws IsiException { // exceção verificada, obrigatoriamente precisa ter o cabecalho throws
														  
		if (nome == null || nome.length()== 0) {
			throw new IsiException("Nome precisa ser preenchido");
		}
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) throws IsiException { // exceção verificada, obrigatoriamente precisa ter o cabecalho throws
		                                                     
		if(preco < 0) {
			throw new IsiException("Preço não pode ser negativo");
		}
		this.preco = preco;
	}
	

}
