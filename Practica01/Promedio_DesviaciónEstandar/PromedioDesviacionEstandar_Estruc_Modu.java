package Promedio_DesviaciónEstandar;
import java.util.Scanner;
public class PromedioDesviacionEstandar_Estruc_Modu {
	
		public static float media(float[] valor) {
			float suma = 0;
			for(int i = 0; i < 10; i ++) {
				suma = suma + valor[i];
			}
			float prom = suma / 10;
			return prom;
		}
		
		public static float desviEstandar(float[] valor, float promedio) {
		    float suma = 0;
		    for(int i = 0; i < valor.length; i++) {
		        suma = (float) (suma + Math.pow(valor[i] - promedio, 2));
		    }
		    
		    //CALCULAMOS LA RAIZ
		    float desviacionEstandar = (float) Math.sqrt(suma / 9);
		    return desviacionEstandar;
		}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		//DECLARANDO EL ARREGLO
		float [] valor;
		//CREANDO EL ARREGLO
		valor = new float [10];
		
		//LLENAMOS EL ARREGLO
		int i = 0;
		for(i = 0; i < 10; i ++) {
			System.out.print("Ingresa el dato " + (i + 1) + " : ");
			valor[i] = leer.nextFloat();
		}
		
		//CALCULAMOS EL PROMEDIO
		float promedio = media(valor); //valor es el nombre del arreglo
		//CALCULAMOS LA DESVIACION ESTANDAR
		float desviacion = desviEstandar(valor, promedio);
		
		//MOSTRAMOS EL PROMEDIO Y LA DESVIACION ESTANDAR
		System.out.println("--------------------------------");
		System.out.println("El promedio es: " + promedio);
		System.out.println("--------------------------------");
		System.out.println("La desviación Estandar: " + desviacion);
	}

}
