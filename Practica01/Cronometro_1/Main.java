package Cronometro_1;

public class Main {

	public static void main(String[] args) {
		Cronometro c1 = new Cronometro();	//creamos un nuevo objeto
		int [] numeros = new int [100000];  //se declara y crea un arreglo
		
		//llenamos y mostramos el arreglo DESORDENADO
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = numeros.length - i;
			
		}
		
		//Metodo que reinicia el cronometro
		c1.inicia();
		
		//ordenacion por seleccion SELECTION SORT
		for(int i = 0; i < numeros.length - 1; i++) {
			int posMin = i; 	//asumimos que el menor esta en i
			for(int j = i + 1; j < numeros.length; j++) {
				if(numeros[j] < numeros[posMin]) {
					posMin = j;	//encontramos un nuevo menor
				}
			}
			
			//intercambiamos
			int numTemporal = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = numTemporal;
			
		}
		
		
		// metodo detener
		c1.detener();
		
		//metodo que muestra el lapso de tiempo
		System.out.println(c1.lapsoDeTiempo());

		
	}

}
