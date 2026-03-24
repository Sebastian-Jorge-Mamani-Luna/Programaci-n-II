package Ejercicio02;

public class Vectores {
    public double x, y, z;

    // --- SOBRECARGA DE CONSTRUCTORES ---
    public Vectores() { // Constructor vacío (vector nulo)
        this.x = 0; 
        this.y = 0; 
        this.z = 0;
    }

    public Vectores(double x, double y) { // Constructor para 2D
        this.x = x; 
        this.y = y; 
        this.z = 0;
    }

    public Vectores(double x, double y, double z) { // Constructor para 3D
        this.x = x; 
        this.y = y; 
        this.z = z;
    }

    // --- SOBRECARGA DEL MÉTODO: Perpendicular ---

    // a) Usando |a + b| = |a - b| (Pasamos un char para diferenciar la firma)
    public boolean Perpendicular(Vectores b, char tipoA) {
        double suma = Math.sqrt(Math.pow(x + b.x, 2) + Math.pow(y + b.y, 2) + Math.pow(z + b.z, 2));
        double resta = Math.sqrt(Math.pow(x - b.x, 2) + Math.pow(y - b.y, 2) + Math.pow(z - b.z, 2));
        return Math.abs(suma - resta) < 0.001;
    }

    // b) Usando |a - b| = |b - a| (Pasamos un int)
    public boolean Perpendicular(Vectores b, int tipoB) {
        double ab = Math.sqrt(Math.pow(x - b.x, 2) + Math.pow(y - b.y, 2) + Math.pow(z - b.z, 2));
        double ba = Math.sqrt(Math.pow(b.x - x, 2) + Math.pow(b.y - y, 2) + Math.pow(b.z - z, 2));
        return Math.abs(ab - ba) < 0.001;
    }

    // c) Usando a · b = 0 (Firma estándar)
    public boolean Perpendicular(Vectores b) {
        return Math.abs((x * b.x) + (y * b.y) + (z * b.z)) < 0.001;
    }

    // d) Usando |a + b|^2 = |a|^2 + |b|^2 (Pasamos un boolean)
    public boolean Perpendicular(Vectores b, boolean tipoD) {
        double sumaCuad = Math.pow(x + b.x, 2) + Math.pow(y + b.y, 2) + Math.pow(z + b.z, 2);
        double modA2 = (x * x) + (y * y) + (z * z);
        double modB2 = (b.x * b.x) + (b.y * b.y) + (b.z * b.z);
        return Math.abs(sumaCuad - (modA2 + modB2)) < 0.001;
    }

    // --- SOBRECARGA DEL MÉTODO: Paralela ---

    // e) Usando a = rb (Recibe el vector y el escalar r)
    public boolean Paralela(Vectores b, double r) {
        return Math.abs(x - (r * b.x)) < 0.001 && Math.abs(y - (r * b.y)) < 0.001;
    }

    // f) Usando a x b = 0 (Recibe solo el vector)
    public boolean Paralela(Vectores b) {
        double cx = y * b.z - z * b.y;
        double cy = z * b.x - x * b.z;
        double cz = x * b.y - y * b.x;
        return (Math.abs(cx) < 0.001 && Math.abs(cy) < 0.001 && Math.abs(cz) < 0.001);
    }

    // g) Proyeccion_de_a_sobre_b
    public String Proyeccion_de_a_sobre_b(Vectores b) {
        double punto = (x * b.x) + (y * b.y) + (z * b.z);
        double modB2 = (b.x * b.x) + (b.y * b.y) + (b.z * b.z);
        double k = punto / modB2;
        return "(" + (k * b.x) + ", " + (k * b.y) + ", " + (k * b.z) + ")";
    }

    // h) Componente_de_a_en_b
    public double Componente_de_a_en_b(Vectores b) {
        double punto = (x * b.x) + (y * b.y) + (z * b.z);
        double modB = Math.sqrt((b.x * b.x) + (b.y * b.y) + (b.z * b.z));
        return punto / modB;
    }
}
