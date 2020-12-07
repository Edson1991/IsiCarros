package userinterface;
import model.Conta;
import model.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
	
	Conta c1, c2;
	
	c1 = new Conta(1234, "Adalberto", "123.456.789-0",100.0); // Instaciado como Conta 
	c2 = new ContaEspecial (9876, "Joao Roberto","987.654.321-0",200.0,500.0);	// Instaciado como Conta Especial
	
	System.out.println(c1);
	System.out.println(c2);
	
	if (c1.debitar(150)) {
		System.out.println("Debito autorizado na conta: "+c1.getNumeroConta());
	}
	else
		System.out.println("Debito negado na conta: "+c1.getNumeroConta());
		
	if (c2.debitar(150)) {
		System.out.println("Debito autorizado na conta: "+c2.getNumeroConta());
	}
	else
		System.out.println("Debito negado na conta: "+c2.getNumeroConta());
		
	System.out.println(c1);
	System.out.println(c2);	

 }
}
