package userinterface;

import model.Estudante;

public class Universidade {
	public static void main(String[] args) {

		Estudante e1 = new Estudante();
		
		e1.setNome("Edson");
		e1.setEmail("Edson@edson.com");
		e1.setTelefone("987654");
		e1.setNumMatricula(1234);
		e1.setCurso("Engenharia");
		
		System.out.println(e1.exibirInfo());
		
 }
}
