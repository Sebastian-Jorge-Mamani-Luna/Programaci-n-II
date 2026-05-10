package SistemaBibliotecaUniversitaria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> librosDisponibles;
    private List<Autor> autoresRegistrados;
    private List<Prestamo> prestamosActivos;
    private Horario horarioAtencion;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.librosDisponibles = new ArrayList<>();
        this.autoresRegistrados = new ArrayList<>();
        this.prestamosActivos = new ArrayList<>();
        this.horarioAtencion = new Horario("Lunes a Viernes", "08:00", "20:00");
    }

    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public void agregarAutor(Autor autor) {
        autoresRegistrados.add(autor);
    }

    public void prestarLibro(Estudiante estudiante, Libro libro) {
        if (librosDisponibles.contains(libro)) {
            Prestamo nuevoPrestamo = new Prestamo(estudiante, libro);
            prestamosActivos.add(nuevoPrestamo);
            librosDisponibles.remove(libro);
            System.out.println("Préstamo registrado: " + libro.getTitulo() + " para " + estudiante.getNombre());
        } else {
            System.out.println("Error: El libro '" + libro.getTitulo() + "' ya está prestado o no existe.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado de la Biblioteca: " + nombre);
        horarioAtencion.mostrarHorario();
        
        System.out.println("\tLibros disponibles en estante:");
        if (librosDisponibles.isEmpty()) {
            System.out.println("\t\tNo hay libros disponibles.");
        } else {
            for (Libro l : librosDisponibles) {
                System.out.println("\t\t- " + l.getTitulo());
            }
        }
        
        System.out.println("\tPréstamos activos: " + prestamosActivos.size());
    }

    public void cerrarBiblioteca() {
        System.out.println("Cerrando la biblioteca. Procesando devoluciones automáticas...");
        for (Prestamo p : prestamosActivos) {
            librosDisponibles.add(p.getLibro());
        }
        prestamosActivos.clear();
    }

    private class Horario {
        private String diasApertura;
        private String horaApertura;
        private String horaCierre;

        public Horario(String diasApertura, String horaApertura, String horaCierre) {
            this.diasApertura = diasApertura;
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public void mostrarHorario() {
            System.out.println("\tHorario de atención: " + diasApertura + ", de " + horaApertura + " a " + horaCierre);
        }
    }
}