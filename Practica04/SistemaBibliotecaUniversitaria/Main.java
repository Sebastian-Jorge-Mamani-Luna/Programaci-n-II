package SistemaBibliotecaUniversitaria;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central UMSA");
        
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiano");
        biblioteca.agregarAutor(autor1);
        
        Libro libro1 = new Libro("Cien años de soledad", "978-3-16-148410-0", 
            Arrays.asList("Muchos años después...", "El coronel Aureliano Buendía..."));
        biblioteca.agregarLibro(libro1);
        
        //libro y autor 2
        Autor autor2 = new Autor("Franz Kafka", "Checo");
        biblioteca.agregarAutor(autor2);
        
        Libro libro2 = new Libro("La Metamorfosis", "978-0141", 
            Arrays.asList("Gregorio Samsa se despertó una mañana...", "No era un sueño, era su habitación..."));
        biblioteca.agregarLibro(libro2);
        //estudiante1
        Estudiante estudiante1 = new Estudiante("1234567", "Sebas");
        
        biblioteca.mostrarEstado();
        System.out.println();
        
        biblioteca.prestarLibro(estudiante1, libro1);
        System.out.println();
        
        biblioteca.mostrarEstado();
        System.out.println();
        
        libro1.leer();
        System.out.println();
        
        //estudiante 2
        System.out.println("-------------------------------------");
        Estudiante estudiante2 = new Estudiante("98765", "Ana");
        
        biblioteca.mostrarEstado();
        System.out.println();
        
        biblioteca.prestarLibro(estudiante2, libro2);
        System.out.println();
        
        biblioteca.mostrarEstado();
        System.out.println();
        
        libro2.leer();
        System.out.println();
        
        
      //estudiante 3 (no podra acceder al libro 2)
        System.out.println("-------------------------------------");
        Estudiante estudiante3 = new Estudiante("98765", "Ana");
        
        biblioteca.mostrarEstado();
        System.out.println();
        
        biblioteca.prestarLibro(estudiante3, libro2);
        System.out.println();
        
        biblioteca.mostrarEstado();
        System.out.println();
        
        System.out.println("********************************");
        biblioteca.cerrarBiblioteca();
        biblioteca.mostrarEstado();
    }
}
