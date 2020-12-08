package ui;

import java.util.Scanner;

import model.IsiException;
import model.Produto;

public class Cadastro {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int id;
		int opcao = 1;
		String nome, strId;
		double preco;
		
		Produto p;
		p = new Produto();
		
	do {
		
		try {		
		
		System.out.println("Digite o ID do produto: ");
		strId = teclado.nextLine();    // Lendo tudo como string devido ao problema do teclado, pois qnd vc digita um numero no teclado 
		id = Integer.parseInt(strId);  // e aperta o ENTER o espaço do ENTER da problema se a proxima leitura for uma String.
									   // Logo lendo tudo da entrada do teclado como String e depois convertendo para os tipos verdadeiros.
		p.setId(id);
		
		System.out.println( "Digite o nome do produto: ");
		nome = teclado.nextLine();
		p.setNome(nome);
		
		System.out.println( "Digite o preço do produto: ");
		preco = Double.parseDouble(teclado.nextLine()); // Lendo como String e convertendo (problema do ENTER do teclado)
														// nao foi declarado variavel strPreco, pois ja fiz direto a conversão										
		p.setPreco(preco);
		
		System.out.println("Produto Cadastrado");
		System.out.println(p);	
		System.out.println("Continua? 1 - sim/ 0 - não");
		opcao = Integer.parseInt(teclado.nextLine()); // Lendo como String e convertendo (problema do ENTER do teclado)
													  // nao foi declarado variavel strOpcao, pois ja fiz direto a conversão
		} 
		catch (IsiException ex){
			System.out.println("Erro na regra de negocio!! "+ ex.getMessage());
		}
		
		catch (NumberFormatException ex){
			System.out.println("Valor inválido "+ ex.getMessage());
		}
		
		catch (Exception ex) {
			System.out.println("Erro desconhecido!!");
			System.out.println(ex.getClass().getName());
		}
		
	} while (opcao != 0);
	teclado.close();
 }

}
