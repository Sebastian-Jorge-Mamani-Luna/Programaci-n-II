package Ejercicio01;

public class Main {

	public static void main(String[] args) {
		
		MiPunto mp1 = new MiPunto();
		
		MiPunto mp2 = new MiPunto(10, 4);

		
		mp1.distancia(mp2); //<-- PASAMOS EL OBJETO 2 COMO PARAMETRO
		
		/*Escriba un programa de prueba que cree los puntos (0, 0) y (10, 30.5) 
		 * y muestre la distancia entre ellos.*/
		
		System.out.println("La distancia entre Los puntos (0, 0) y (10, 30.5) es: " + mp1.distancia(10, 30.5));  //<-- PASAMOS LOS DATOS POR PARAMETROS
		
		
		
	}

}
