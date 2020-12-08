package core;

public class BDPostgres implements InterfaceBD {

	@Override
	public void conectar(String bd, String usuario) {
		System.out.println("Connecting Postgres on database > "+bd+" with user"+usuario);		
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("Postgres> "+comando);		
		
	}

	@Override
	public void desconectar(String bd) {
		System.out.println("Loggin out from Postgres on database > "+bd);		
		
	}
	
}
