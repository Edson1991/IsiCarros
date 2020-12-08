package userinterface;

import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		/*Versão 1.0, trabalhando com vetor sem redimensionamento
		 * Funcionario lista [];
		
		lista = new Funcionario[4]; 
		
		lista[0] = new Horista("José Horista",1234,50.0,50);
		lista[1] = new Empreiteiro("Pedro Empreiteiro",4321, 2000.0);
		lista[2] = new Comissionado("Bruno Comissionado",4457, 2500.0,7.0);
		lista[3] = new Chefe("Isidro Chefe",7643, 100000.0,12.0,300.00);
		
		*/
		
		/*Versão 2.0 com redimensionamento de vetor (ArrayLists)
		 * 
		 */
		ArrayList<Funcionario> lista; //declarando lista como ArrayLists
		
		lista = new ArrayList<Funcionario>();  // instaciando
		
		lista.add(new Horista("José Horista",1234,50.0,50));
		lista.add(new Empreiteiro("Pedro Empreiteiro",4321, 2000.0));
		lista.add(new Comissionado("Bruno Comissionado",4457, 2500.0,7.0));
		lista.add(new Chefe("Isidro Chefe",7643, 100000.0,12.0,300.00));
				

		System.out.println(">>>>>>>>>>>FOLHA DE PAGAMENTOS<<<<<<<<<<<");
		System.out.println("=========================================");

		
		for (int pos=0; pos<lista.size();pos++) {
			System.out.println(lista.get(pos).getNome());
		}
		 
		
		for (Funcionario f : lista ) { // a variavel f só é valida durante esse for
			System.out.printf("%2d - %-20s R$ %9.2f%n",f.getNumeroRegistro(),f.getNome(),f.calcularSalario() );
			}
		
		
		/*Essa forma de escrever a repetição "FOR" acima, substitiu a forma abaixo comentada abaixo, pois existe um FOR especifico para array.
		 * 
		 * for (int pos=0; pos<lista.length;pos++) {
		System.out.println("Salario do "+lista[pos].getNome()+": R$ "+lista[pos].calcularSalario());
		}
		 */
		System.out.println("=========================================");

	}

}
