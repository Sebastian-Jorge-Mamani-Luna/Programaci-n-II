package Promedio_DesviaciónEstandar;

public class PromedioDesviacionEstandar {
	private float a;
	private float b;
	private float c;
	private float d;
	private float e;
	private float f;
	private float g;
	private float h;
	private float i;
	private float j;
	
	
	//el constructor parametrizado
	public PromedioDesviacionEstandar(float a, float b, float c, float d, float e, float f, float g, float h, float i,
			float j) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		this.i = i;
		this.j = j;
	}
	
	
	//calculamos el promedio
	public float promedio() {
		return (this.a + this.b + this.c + this.d + this.e + this.f + this.g + this.h + this.i + this.j)/10;	
	}

	//calculamos la desviacion estandar
	public float desviacion(float promedio) {
		float suma = (float) (Math.pow(a - promedio, 2) + Math.pow(b - promedio, 2) + Math.pow(c - promedio, 2) + Math.pow(d - promedio, 2)
        + Math.pow(e - promedio, 2) + Math.pow(f - promedio, 2) + Math.pow(g - promedio, 2) + Math.pow(h - promedio, 2)
        + Math.pow(i - promedio, 2) + Math.pow(j - promedio, 2));
		return (float)Math.sqrt(suma / 9);	
	}
}
