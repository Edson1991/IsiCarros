package core;

/* Na interface eu defino APENAS QUAIS DEVEM SER AS OPERA��ES 
 */

public interface InterfaceBD {
	
	public void conectar(String bd, String usuario);
	public void executar(String comando);
	public void desconectar (String bd);
	
}
