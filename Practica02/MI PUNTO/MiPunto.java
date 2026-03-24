package Ejercicio01;

public class MiPunto {
	//INCISO A
	private double x;
	private double y;
		
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	//INCISO B
	public MiPunto() {
		this.x = 0;
		this.y = 0;
	}
	
	//INCISO C
	public MiPunto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	//INCISO D
	public double distancia(MiPunto p2) {   
		double deltaX = p2.x - this.x;
		double deltaY = p2.y - this.y;
		double distanciaDosPuntos = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		return distanciaDosPuntos; 
	}
	
	//INCISO E
	public double distancia(double x2, double y2) {  //Método sobrecargado
		double deltaX = x2 - this.x;
		double deltaY = y2 - this.y;
		double distanciaDosPuntos = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		return distanciaDosPuntos;
	}
}

