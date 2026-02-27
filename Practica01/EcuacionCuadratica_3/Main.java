package EcuacionCuadratica_3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		//declaramos y creamos el arreglo
		double [] valoresTerminos = new double [3];
		//llenamos el arreglo
		for(int i = 0; i < 3; i ++) {
			System.out.print("Ingrese el valor del termino "+ (i + 1) + ": ");
			valoresTerminos[i] = leer.nextDouble();
		}
		
		//creamos el objeto
		EcuacionLineal ecl1 = new EcuacionLineal(valoresTerminos[0], valoresTerminos[1], valoresTerminos[2]);
		
		
		//se decide que hacer dependiendo si el discriminante es positivo, negativo o 0
		if(ecl1.getDiscriminante() > 0) {
			System.out.println("La ecuación tiene dos raíces: " + ecl1.getRaiz1() + " y " + ecl1.getRaiz2());
			
		}else {
			if(ecl1.getDiscriminante() == 0) {
				System.out.println("La ecuación tiene una raíz: " + ecl1.getRaiz1());  //Elegimos getRaiz1 ya que getRaiz1 y getRaiz2 son iguales
			}else {
				System.out.println("La ecuación no tiene raíces reales");
			}
		}
	}

}
