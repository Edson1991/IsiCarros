package model;

/* Na classe abstrata, definimos um TEMPLATE (modelo) minimo para que os nossos futuros
 * tipos de dados (herdados) tenham como base
 * 
 */

public abstract class Veiculo {
	protected String marca;
	protected String placa;
	
	
	public Veiculo(String marca, String placa) {
		super();
		this.marca = marca;
		this.placa = placa;
	}

	/*
	 * Agora o grande trunfo das classes abstratas está na possibilidade de definir
	 * "clausulas contratuais" de implementação de metodos, ou seja, na classe abstrata eu defino
	 * QUAIS METODOS as classes filhas DEVEM implementar....Como implementar isso? Fica a cargo
	 * de cada classe filha. 
	 */
	
	public abstract void acelerar();
	public abstract void frear();
	
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	

}
