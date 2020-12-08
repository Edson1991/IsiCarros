package ui;
import java.util.Scanner;

import core.BombaDeCombustivel;

public class Posto {
	public static void main(String[] args) {

	 Scanner teclado = new Scanner(System.in);
	 double litros,valorAbastecer, valorLitro;
	 String tipo;
		
		try {
		System.out.println("*************VALORES INICIAIS DA BOMBA*************");
		BombaDeCombustivel b1 = new BombaDeCombustivel("Vazio", 0.00, 0.00, 0.00);	// estou passando logo no começo os atributos para o metodo construtor
																					// que só irá rodar uma vez no inicio do programa.
		System.out.println(b1.exibirComprovante());
					
		System.out.println("Frentista: Digite o tipo do combustivel , a quantidade de litros que quer abastecer e o valor do litro, pfv?");
		tipo = teclado.nextLine();
		litros = Double.parseDouble(teclado.nextLine());	
		valorLitro = Double.parseDouble(teclado.nextLine());
		System.out.println("Cliente:   Abastecer "+litros+" litro (s) de: "+tipo+", com valor do litro saindo a R$ "+valorLitro);
		b1.setNomeCombustivel(tipo);
		b1.setValorCombustivel(valorLitro);
		b1.abastecerPorLitros(litros);		
		
		System.out.println(b1.exibirComprovante());	
		
		System.out.println("Frentista: Digite o tipo do combustivel , o valor que quer abastecer e o valor do litro, pfv?");
		tipo = teclado.nextLine();
		valorAbastecer = Double.parseDouble(teclado.nextLine());
		valorLitro = Double.parseDouble(teclado.nextLine());	
		System.out.println("Cliente:   Abastecer R$ "+valorAbastecer+" de: "+tipo+", com valor do litro saindo a R$ "+valorLitro);
		b1.setNomeCombustivel(tipo);
		b1.setValorCombustivel(valorLitro);
		b1.abastecerPorValor(valorAbastecer);
		
		System.out.println(b1.exibirComprovante());	
		}
		catch(Exception ex) {
			System.out.println("Erro!!"+ ex.getMessage());
		}
		teclado.close();
	}
}
