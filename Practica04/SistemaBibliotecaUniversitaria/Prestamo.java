package SistemaBibliotecaUniversitaria;

import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = this.fechaPrestamo.plusDays(7);
    }

    public void mostrarInfo() {
        System.out.println("Préstamo registrado:");
        estudiante.mostrarInfo();
        System.out.println("Libro prestado: " + libro.getTitulo());
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Fecha de devolución: " + fechaDevolucion);
    }
    
    public Libro getLibro() {
        return this.libro;
    }
}
