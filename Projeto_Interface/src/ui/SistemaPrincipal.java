package ui;

import core.BDMySQL;
import core.BDPostgres;
import core.InterfaceBD;

/* Por que usar interfaces?
 * Interfaces definem o "encaixe" entre o seu sistema e os objetos que seus sistema deverá 
 * utilizar alta coesão com baixo acoplamento
 * 
 * Se um objeto quiser se "encaixar" no seu sistema, ele deve seguir essa especificação
 *Quem define este encaixe? ---> A interface
 *O Objeto? --> Implementa a interface para adequar-se ao seu sistema
 */

public class SistemaPrincipal {
	public static void main(String[] args) {
		
		// 3 passos
		// Passo 1 - conectar no banco de dados
		// Passo 2 - executar um comando do banco
		// Passo 3 - desconectar do banco
	
		InterfaceBD ibdsql,ibdpostgres;
		
		ibdsql = new BDMySQL(); // instaciei um objeto que implementa está interface
		ibdpostgres = new BDPostgres(); // instaciei um objeto que implementa está interface
		
		ibdsql.conectar("sistema", "adminSQL");
		ibdsql.executar("select * from tabela");
		ibdsql.desconectar("sistema");
		
		System.out.println("");		
		
		ibdpostgres.conectar("sistema", "adminPostgres");
		ibdpostgres.executar("select * from tabela");
		ibdpostgres.desconectar("sistema");
	
	
	}

}
