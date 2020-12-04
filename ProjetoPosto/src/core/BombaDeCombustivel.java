package core;

public class BombaDeCombustivel {

	private String nomeCombustivel;
	private double valorCombustivel;
	private double qtdLitros;
	private double valorTotal;

	// metodo constrututor - é chamado uma vez só no começo do programa, pode ter N com o mesmo nome, entretato com qtde de atirubos diferentes;
	public BombaDeCombustivel(String nome, double preco, double litros, double valor) {
		
		nomeCombustivel = nome;
		valorCombustivel = preco;
		qtdLitros = litros;
		valorTotal = valor;
	}

	//metodos Getters and Setters
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

	public double getValorCombustivel() {
		return valorCombustivel;
	}

	public void setValorCombustivel(double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}

	public double getQtdLitros() {
		return qtdLitros;
	}

	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	//metodo exibir resultado
	public String exibirComprovante() {
		String resultado = "===================================================\n"+
						   "           RECIBO - POSTO DE GASOLINA\n"              +
						   "===================================================\n"+
				           "Nome do Combustivel: " + nomeCombustivel + " -> Valor R$/l: " + valorCombustivel+"\n"+
				           "Qtde de Litros: "+ String.format("%.2f\n", qtdLitros)+"\n"+ 
				           
				           "Valor Total: R$ " + String.format("%.2f\n", valorTotal) + 
				           "===================================================\n";
		return resultado;
	}

	// metodo informando litros para calcular valor total a ser pago
	public void abastecerPorLitros(double litros) {
		qtdLitros = litros;
		valorTotal = litros * valorCombustivel;
	}

	// metodo informando valor total a ser pago para calcular qtde litros
	public void abastecerPorValor(double valor) {
		valorTotal = valor;
		qtdLitros = valor / valorCombustivel;
	}

}
