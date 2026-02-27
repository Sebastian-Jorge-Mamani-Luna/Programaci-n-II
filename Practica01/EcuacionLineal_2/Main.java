package EcuacionLineal_2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		//declaramos y definimos el arreglo
		double [] valores = new double [6];
		
		
		/*SOLICITAMOS DATOS POR TECLADO*/
		for(int i = 0; i < 6; i++) {
			System.out.print("Ingrese el valor "+ (i + 1) + ": ");
			valores [i] = leer.nextDouble();
		}
		
		/*CREAMOS EL OBJETO*/
		EcuacionLineal el1 = new EcuacionLineal(valores[0],valores[1], valores[2], valores[3], valores[4], valores[5]);
		
		
		/*CON ESTE IF DETERMINAMOS  SI LA ECUACION TIENE O NO SOLUCION*/
		if(el1.tieneSolucion()) {
			System.out.println("Las soluciones de la ecuación: ");
			System.out.println("x : " + el1.getX());
			System.out.println("y : " + el1.getY());
		}else {
			System.out.println("La ecuación no tiene solución");
		}
	}
	
}