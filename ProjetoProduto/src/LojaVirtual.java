
public class LojaVirtual {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		Produto p3 = new Produto();	
		
		/*Este trecho de código é para preencher os atritubos de cada um dos objetos*/
		 
		p1.setNome("Cerveja");
		p1.setDepartamento("Bebidas Álcoolicas");
		p1.setCodBarras(1);
		p1.setPreco(3.50);
		
		p2.setNome("Coca-Cola 2L");
		p2.setDepartamento("Bebidas Não Álcoolicas");
		p2.setCodBarras(2);
		p2.setPreco(7.00);
		
		p3.setNome("Iphone 12");
		p3.setDepartamento("Smartphones");
		p3.setCodBarras(3);
		p3.setPreco(6500.00);
		
		System.out.println("-----------------PRODUTOS SEM DESCONTOS--------------------");
		System.out.println(p1.mostrarProduto());
		System.out.println(p2.mostrarProduto());
		System.out.println(p3.mostrarProduto());

		
		System.out.println("-------------------BREKFRAIDE DA LOJINHA-------------------");
		System.out.println("");				
		System.out.printf("Cerveja com 10 %% de desconto saindo por: R$ %.2f%n",p1.aplicarDesconto(10.0));		
		System.out.printf("Coca-Cola 2L com 15 %% de deconto saindo por: R$ %.2f%n",p2.aplicarDesconto(15.0));		
		System.out.printf("Iphone 12 com 20 %% de desconto saindo por: R$ %.2f%n",p3.aplicarDesconto(20.0));
		System.out.println("");	
		System.out.println("-----------------------------------------------------------");
		
		p3.setNome("Iphone 13");
		System.out.println("Nome modificado do P3: "+p3.getNome());

		
	}

}
