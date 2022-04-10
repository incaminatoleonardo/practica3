package ar.unrn.eje1;

public class CopiaLibro {
	private Libro libro;

	public CopiaLibro(Libro libro) {
		this.libro = libro;
	}

	public Libro libro() {
		return libro;
	}

	public double calcularDeuda(int diasAlquilados) {

		return libro.calcularDeuda(diasAlquilados);

	}

	public int calcularPuntos(int diasAlquilados) {

		return libro.calcularPuntos(diasAlquilados);
	}
}