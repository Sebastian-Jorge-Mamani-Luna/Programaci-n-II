package EcuacionLineal_2;
//import java.util.Scanner;
public class EcuacionLineal {
	
	/*INCISO A*/
	private double a;
	private double b; 
	private double c;
	private double d;
	private double e;
	private double f;
	
	/*INCISO B*/
	public EcuacionLineal(double a, double b, double c, double d, double e, double f) {  //para los argumentos, entonces constructor parametrizado
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	/*INCISO C*/
	public boolean tieneSolucion() {
		if((a * d) - (b * c) != 0) {
			return true;  // si retorna true la ecuación tendra solución
		}
		return false;	// si retorna false la ecuación no tendra solución
	}

	
	/*INCISO D*/
	public double getX() {
		double x = ((e * d - b * f)/(a * d - b * c));  //se usara si en caso la ecuacion tiene solucion
		return x;
	}
	
	public double getY() {
		double y = ((a * f - e * c)/(a * d - b * c));	//se usara si en caso la ecuacion tiene solucion
		return y;
	}
	
	
}
