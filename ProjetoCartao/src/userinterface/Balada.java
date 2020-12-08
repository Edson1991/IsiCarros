package userinterface;

import java.util.ArrayList;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class Balada {
	public static void main(String[] args) {
	
		
		//A Nota��o [] indica que a variavel cart�es n�o armazena mais um �nico objeto
		// e sim um conjunto d eojetos
		// Todo conjunto (vetor/array) � cole��o de tamanho fixo e n�o redimensionavel, que armazena
		//um n�mero finito de valores.
		//cada valor � acessado atrav�s de uma posi��o (que sempre inicia em oo)
		
		//CartaoPrePago cartoes[]; // declarei o conjunto
		//cartoes = new CartaoPrePago[5]; // aqui eu defino que o meu vetor Cartoes tem tamanho 5
										// o que siginica isso? Que eu posso apontar para 5 objetos diferentes
		
		// esta declara��o acima equivale a substituir 5 declara��es de variaveis do tipo cartaoPrePago
		// agora, mais do que nunca, preciso dos objetos
		// a nota��o [0] indica que estou acessando aposi��o 0 do vetor, e assim por diante.
		
		//cartoes[0] = new CartaoPrePago ("11111", "Cliente PP1",2030,10,100);
		//cartoes[1] = new CartaoCashBack ("22222", "Cliente CB1",2030,10,200,1);
		//cartoes[2] = new CartaoCashBack ("33333", "Cliente CB2",2030,10,300,2);
		//cartoes[3] = new CartaoCashBack ("44444", "Cliente CB3",2030,10,400,3);
		//cartoes[4] = new CartaoCashBack ("55555", "Cliente CB5",2030,10,400,3);

				
		ArrayList<CartaoPrePago> lista;		
		lista = new ArrayList<CartaoPrePago>();
		
		lista.add(new CartaoPrePago ("11111", "Cliente PP1",2030,10,100));
		lista.add(new CartaoCashBack ("22222", "Cliente CB1",2030,10,200,1));
		lista.add(new CartaoCashBack ("33333", "Cliente CB2",2030,10,300,2));
		lista.add(new CartaoCashBack ("44444", "Cliente CB3",2030,10,400,3));
		lista.add(new CartaoCashBack ("55555", "Cliente CB5",2030,10,500,3));

		for (int pos=0; pos< 5; pos++) {
			lista.get(pos).adiconarCredito(1000);
			System.out.println("Adicionando R$ 1000 no cart�o: "+lista.get(pos).getNumeroCartao());
		}
		
		System.out.println("");

		for (int pos=0; pos<lista.size();pos++) {
			if(lista.get(pos).comprar(100.00)){
				System.out.println("Compra aprovada no cart�o "+lista.get(pos).getNumeroCartao());
			}
			else {
				System.out.println("Compra nao autorizada no cartao "+lista.get(pos).getNumeroCartao());
			}
		}
		
		System.out.println("");
			
		for (int pos=0; pos<lista.size();pos++) {
				System.out.println(lista.get(pos)); // chamando o metodo "toString" das classes filha ou pai (dependendo da posi��o do vetor)
													// nota-se que n�o precisa informar o nome metodo
			}	
		
	
		/*CartaoPrePago c1, c2, c3, c4;
		
		c1 = new CartaoPrePago("11111", "Edson", 2025,11,100); // Instaciado como CartaoPrePago 
		c2 = new CartaoCashBack ("22222", "Paola", 2022,07,200,1);	// Instaciado como  Cash Back 
		c3 = new CartaoCashBack ("33333", "Jose", 2023,6,300,2);	// Instaciado como  Cash Back  
		c4 = new CartaoCashBack ("44444", "Pedro", 2024,5,400,3);	// Instaciado como  Cash Back 

		
		System.out.println(c1);
		System.out.println(c2);	
		System.out.println(c3);	
		System.out.println(c4);	
		
		
		if (c1.comprar(100)) {
			System.out.println("Debito autorizado no cart�o: "+ c1.getNumeroCartao());
		}
		else
			System.out.println("Debito negado no cart�o: "+c1.getNumeroCartao());
			
		if (c2.comprar(200)) {
			System.out.println("Debito autorizado na conta: "+c2.getNumeroCartao());
		}
		else
			System.out.println("Debito negado na conta: "+c2.getNumeroCartao());
		
		if (c3.comprar(300)) {
			System.out.println("Debito autorizado na conta: "+c3.getNumeroCartao());
		}
		else
			System.out.println("Debito negado na conta: "+c3.getNumeroCartao());
		
		if (c4.comprar(400)) {
			System.out.println("Debito autorizado na conta: "+c4.getNumeroCartao());
		}
		else
			System.out.println("Debito negado na conta: "+c4.getNumeroCartao());
			
		System.out.println("\n");
		System.out.println(c1);
		System.out.println(c2);	
		System.out.println(c3);	
		System.out.println(c4);	
		*/			
	}
}
