import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int a,b,r;
		
		try {
			
			System.out.println("Digite um valor: ");
			a = teclado.nextInt();
			System.out.println("Digite outro valor: ");
			b = teclado.nextInt();			
			r = a/b;			
			System.out.println("Resultado da divisão = "+r);
			teclado.close();
			
		}
		// Os "catch" precisam ir da exceção mais especifica para a mais generica.
		catch (InputMismatchException ex) {  
			System.out.println("Por favor usuario, digite um número inteiro!");
		}
		catch(ArithmeticException ex) {
			System.out.println("Ei o segundo valor precisa ser diferente de 0!!");
		}
		catch (Exception ex) {
			System.out.println("Deu ruim!");
			System.out.println("Tipo da exceção "+ ex.getClass().getName());
		}
		
	}
 }

