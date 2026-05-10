package SistemaBibliotecaUniversitaria;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String isbn;
    private List<Pagina> paginas;

    public Libro(String titulo, String isbn, List<String> contenidos) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
        
        for (int i = 0; i < contenidos.size(); i++) {
            this.paginas.add(new Pagina(i + 1, contenidos.get(i)));
        }
    }

    public void leer() {
        System.out.println("Leyendo: " + titulo);
        for (Pagina pagina : paginas) {
            pagina.mostrarPagina();
        }
    }

    public String getTitulo() {
        return titulo;
    }

 
    public Libro getLibro() {
        return this;
    }
    
    private class Pagina {
        private int numeroPagina;
        private String contenidoPagina;

        public Pagina(int numeroPagina, String contenidoPagina) {
            this.numeroPagina = numeroPagina;
            this.contenidoPagina = contenidoPagina;
        }

        public void mostrarPagina() {
            System.out.println("Página " + numeroPagina + ": " + contenidoPagina);
        }
    }
}
