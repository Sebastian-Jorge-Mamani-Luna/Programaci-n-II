package POLIGONO_REGULAR;

/*■ Un campo de datos privado int llamado n que define el número de lados del polígono con un valor predeterminado de 3.
■ Un campo de datos privado double llamado lado que almacena la longitud del lado con un valor predeterminado de 1.
■ Un campo de datos privado double llamado x que define la coordenada x del centro del polígono con un valor predeterminado de 0. 
■ Un campo de datos privado double llamado y que define la coordenada y del centro del polígono con un valor predeterminado de 0.
*/

public class PoligonoRegular {
	private int n = 3;   //numero de lados de un poligono
	private double lado = 1;  //longitud del lado
	private double x = 0;	//coordenada x del centro del poligono
	private double y = 0;	//coordenada y del centro del poligono
	
	
	public PoligonoRegular() {
		this.n = 4;
		this.lado = 5;
		this.x = 1;
		this.y = 1;
	}
	
	public PoligonoRegular(int n, double lado) {
		this.n = n; 
		this.lado = lado;
		this.x = 0;
		this.y = 0;
	}
	
	public PoligonoRegular(int n, double lado, double x, double y) {
		this.n = n;
		this.lado = lado;
		this.x = x;
		this.y = y;
	}
	
	public double getPerimetro() {
		double perimetro = this.n * this.lado;
		return perimetro;
	}
	
	public double getArea() {
		double Area = ((this.n * Math.pow(this.lado,2))/(4 * Math.tan(Math.PI / 6)));
		return Area;
	}
}
