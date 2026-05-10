package SistemaBibliotecaUniversitaria;

public class Estudiante {
    private String codigoEstudiante;
    private String nombre;

    public Estudiante(String codigoEstudiante, String nombre) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " \n Código: " + codigoEstudiante);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}
