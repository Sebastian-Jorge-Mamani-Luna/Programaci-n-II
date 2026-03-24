package Ejercicio02;

public class Main {
    public static void main(String[] args) {
        // Uso de constructores sobrecargados
        Vectores a = new Vectores(3, 4, 0);
        Vectores b = new Vectores(1, 2, 0);
        // Prueba de métodos sobrecargados con los nombres exactos
        System.out.println("Perpendicular (c): " + a.Perpendicular(b));
        System.out.println("Perpendicular (a): " + a.Perpendicular(b, 'a'));
        
        System.out.println("Paralela (f): " + a.Paralela(b));
        
        System.out.println("Proyección: " + a.Proyeccion_de_a_sobre_b(b));
        System.out.println("Componente: " + a.Componente_de_a_en_b(b));
    }
}
