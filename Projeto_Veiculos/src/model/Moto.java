package model;

public class Moto extends Veiculo {

		private String tipo;

		public Moto(String marca, String placa, String tipo) {
			super(marca, placa);
			this.tipo = tipo;
		}

		@Override // boa pratica usar Override --> Usado para sobrescrever um metodo "j� existente" na classe PAI
		public void acelerar() {
			System.out.println("Moto "+super.marca+ "/"+this.tipo+" acelera na m�o");

		}

		@Override // boa pratica usar Override --> Usado para sobrescrever um metodo "j� existente" na classe PAI
		public void frear() {
			System.out.println("Moto "+super.marca+ "/"+this.tipo+" freia no p�");

		}
		
		
			
}
