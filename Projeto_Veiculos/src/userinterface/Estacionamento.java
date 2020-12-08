package userinterface;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class Estacionamento {
	public static void main(String[] args) {
		
		Veiculo v[];
		
		v = new Veiculo[2];
		
		v[0] = new Carro("Fiat", "ABC1234", "URBANO");
		v[1] = new Moto("CG125", "XYZ1234", "MotoCross");
		
		for (int pos=0; pos<v.length;pos++) {
			v[pos].acelerar();
			v[pos].frear();	
			}
	}
}
