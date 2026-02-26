package Cronometro_1;

public class Cronometro {
	
	//Se uso long para almacenar numeros grandes
	private long inicia;
	private long finaliza;
	
	/* constructor sin argumentos */
	public Cronometro (){
		//System.currentTimeMillis() devuelve la hora actual en milisegundos
		inicia = System.currentTimeMillis();
	}
	
	//metodos
	public void inicia() { //toma el tiempo inicial
		//System.currentTimeMillis() devuelve la hora actual en milisegundos
		inicia = System.currentTimeMillis();
	}
	
	public void detener() { //toma el tiempo final
		finaliza =  System.currentTimeMillis();
	}
	
	
	//calculamos el tiempo transcurrido restando: tiempo final - tiempo inicial 
	public long lapsoDeTiempo() {
		long transcurrido = finaliza - inicia;
		return transcurrido;
	}
	
}
