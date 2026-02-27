package Promedio_DesviaciónEstandar;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//double [] valores = new double [6];
		
		//declaramos y creamos el arreglo
		float [] valores = new float [10];
		
		//llenamos el arreglo 
		for(int i = 0; i < 10; i++) {
			System.out.println("Ingrese el valor " + (i + 1) + ": ");
			float valor = leer.nextFloat();
			valores[i] = valor; 
		}
		
		
		//creamos el objeto
		PromedioDesviacionEstandar pde1 = new PromedioDesviacionEstandar(valores[0], valores[1], valores[2], valores[3], valores[4], valores[5], valores[6], valores[7], valores[8], valores[9]);
		
		//mostramos el promedio
		System.out.println("El promedio es " + pde1.promedio());
		
		//mostramos la desviacion estandar
		System.out.println("La desviación estandard es " + pde1.desviacion(pde1.promedio()));
	}

}
