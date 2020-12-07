package userinterface;
import core.ContaBancaria; // Importe feito, pois foi criado packages (tipo um diretorio) sendo que o "Banco.java" está no package "userinterface"
//e o ContaBancaria está no package "core", assim a classe "Banco.java" consegue visualizar a classe "ContaBancaria.java"

public class Banco {
	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();

		/* Este trecho de código é para preencher os atritubos de cada um dos objetos */

		c1.setTitular("Edson");
		c1.setCpf("012.345.678-9");
		c1.setNumeroConta(0001);
		c1.depositar(1000.00);

		c2.setTitular("Paola");
		c2.setCpf("987.654.321-0");
		c2.setNumeroConta(0002);
		c2.depositar(2000.00);

		System.out.println("---------------VALORES ATUAIS DAS CONTAS--------------------");
		System.out.println(c1.mostrarDadosConta());
		System.out.println(c2.mostrarDadosConta());

		System.out.println("---------------SACANDO VALOR DAS CONTAS--------------------");

		System.out.println("Sacando R$ 2000,00 da conta do Edson");

		if (c1.sacar(2000.00)) {
			System.out.println("********Saque Autorizado********\n");
			System.out.println(c1.mostrarDadosConta());
		} else {
			System.out.println("!!!!!!!! OPS, Saldo Insuficiente !!!!!!!!\n");
		}
		System.out.println("Sacando R$ 2000,00 da conta da Paola");

		if (c2.sacar(2000.00)) {
			System.out.println("********Saque Autorizado********\n");
			System.out.println(c2.mostrarDadosConta());
		} else {
			System.out.println("!!!!!!!! OPS, Saldo Insuficiente !!!!!!!!\\n");
		}

		System.out.println("---------------CREDITANDO VALOR DAS CONTAS--------------------");

		System.out.println("Creditando R$ 2000,00 na conta do Edson");
		c1.depositar(2000.00);
		System.out.println(c1.mostrarDadosConta());

		System.out.println("Creditando R$ 2000,00 na conta da Paola");
		c2.depositar(2000.00);
		System.out.println(c2.mostrarDadosConta());

	}

}
