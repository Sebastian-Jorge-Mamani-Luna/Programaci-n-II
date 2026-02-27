package EcuacionCuadratica_3;

public class EcuacionLineal {
	/*INCISO A*/
	private double a;
	private double b; 
	private double c;
	
	/*INCISO B*/
	public EcuacionLineal(double a, double b, double c){ //tenemos el constructor
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/*INCISO C*/
	public double getDiscriminante(){	//Evaluamos si el discriminante es positivo, negativo o 0 
		return ((b * b) - (4 * a * c));  
	}
	
	
	/*INCISO D*/
	
	//si en caso el discriminante es positivo o 0 se aplicaran estos metodos caso contrario no
	
	public double getRaiz1(){
	    double disc = getDiscriminante(); 
	    if (disc < 0) {
	        return 0; 
	    }
	    return (-b + Math.pow((b*b - 4*a*c), 0.5)) / (2*a);
	}
	
	
	public double getRaiz2() {
		double disc = getDiscriminante();
        if (disc < 0) {
            return 0; 
        }
        return (-b - Math.pow((b*b - 4*a*c), 0.5)) / (2*a);
	}
	
}
