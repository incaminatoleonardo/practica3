package ar.unrn.eje1;

public class Libro {

	private String nombre;

	public Libro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String nombre() {
		return nombre;
	}

	public double calcularDeuda(int diasAlquilados) {

		return 0;
	}

	public int calcularPuntos(int diasAlquilados) {

		return 1;
	}
}