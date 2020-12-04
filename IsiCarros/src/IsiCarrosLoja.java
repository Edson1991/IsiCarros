
public class IsiCarrosLoja {
	public static void main(String[] args) {
		
		//Aqui eu estou declarando vari�veis do tipo Carro (que � uma estrutura)
		Carro c1, c2, c3;
		FabricaDeCarros f1;
		f1 = new FabricaDeCarros();
		
		//Aqui estou efetivamente pedindo mem�ria para Java Virtual Machine poder armazenar os dados do tipo carro nas variais c1 e c2
		c1 = new Carro();
		c2 = new Carro();
				
		//Aqui estou efetivamente atribuindo valores a cada atributo da estrutura Carro

		c1.marca  = "Porche";
		c1.modelo = "Kaieny";
		c1.cor    = "Azul";
		c1.ano    = 2020;
		c1.preco  = 1250000.00;
		
		c2.marca  = "Xevrol�";
		c2.modelo = "C�rsa";
		c2.cor    = "Cinza";
		c2.ano    = 1998;
		c2.preco  = 3852.00;
		
		//Aqui estou chamando a fun��o IMPRIMIR para mostrar o carros 
		double ipva;
		
		c1.imprimir();
		ipva = c1.calcularIPVA();
		System.out.println("IPVA 1: "+ipva);
		
		c2.imprimir();			
		ipva = c2.calcularIPVA();				
		System.out.println("IPVA 2: "+ipva);
		
		c3 = f1.fabricarUmCarroNovo("amarelo");
		c3.imprimir();
	}

}
