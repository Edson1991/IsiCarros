package ui;

import model.InterfaceA;
import model.InterfaceB;
import model.InterfaceC;
import model.ObjetoABC;

public class ClassePrincipal {
	public static void main(String[] args) {
		
		ObjetoABC objABC;
		
		objABC = new ObjetoABC();
		
		objABC.metodoA1();
		objABC.metodoA2();
		objABC.metodoB1();
		objABC.metodoB2();
		objABC.metodoC1();
		objABC.metodoC2();

		InterfaceA ia = objABC;
		InterfaceB ib = objABC;
		InterfaceC ic = objABC;

		
	}

}
