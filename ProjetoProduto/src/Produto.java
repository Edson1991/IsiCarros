//Classe de estrutura PRODUTO que contem: Nome, Departamento, Preço e Código de Barras

public class Produto {
	private int codBarras;
	private String nome;
	private String departamento;
	double preco;
	
	// Já que meus atributos estão blindados (encapsulados) com  "private" antes do atributo, precisamos de mecanismos para acessá-los
	// Isso implica em uma funcionalidade (método) para modificar seu valor e outro método para consultar o seu valor.
	// Para isso, basta ir em SOURCE --> Generate Getter and Setter --> Select all e Clica em finish;
	
	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
		
	//Metodo para mostrar os produto
	public String mostrarProduto() {
		String resultado = "Nome: "+nome+ "\nPreço: R$ "+preco+"\nCódigo de Barras: "+codBarras+ "\nDepartamento: "+departamento+"\n";
		return resultado;		
	}
	

	//Metodo para aplicar desconto
	public double aplicarDesconto (double desconto) {
		double precodesconto;
		precodesconto = preco - (preco*desconto/100);
	return precodesconto;
	}

}
