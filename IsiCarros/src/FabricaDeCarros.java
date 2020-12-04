
public class FabricaDeCarros {
	String nome;
	
	Carro fabricarUmCarroNovo(String corDoCarro){
		Carro novoCarro = new Carro();
		novoCarro.marca = "Vorquisvaguem";
		novoCarro.modelo = "Gorzinho bola";
		novoCarro.ano = 2020;
		novoCarro.cor = corDoCarro;
		novoCarro.preco = 30000;
		
		return novoCarro;	
		
	}
}
