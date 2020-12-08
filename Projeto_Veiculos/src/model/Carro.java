package model;

public class Carro extends Veiculo {
	
	private String estilo;

	public Carro(String marca, String placa, String estilo) {
		super(marca, placa);
		this.estilo = estilo;
	}

	@Override // boa pratica usar Override --> Usado para sobrescrever um metodo "j� existente" na classe PAI
	public void acelerar() {
		System.out.println("Carro "+super.marca+ "/"+this.estilo+" acelera no p�");
	}

	@Override // boa pratica usar Override --> Usado para sobrescrever um metodo "j� existente" na classe PAI 
	public void frear() {
		System.out.println("Carro "+super.marca+ "/"+this.estilo+" freia na m�o");
	}
	
	

}
