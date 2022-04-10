package ar.unrn.eje1;

public class LibroNuevoLanzamiento extends Libro {

	public LibroNuevoLanzamiento(String nombre) {
		super(nombre);

	}

	@Override
	public double calcularDeuda(int diasAlquilados) {

		return diasAlquilados * 3;
	}

	@Override
	public int calcularPuntos(int diasAlquilados) {

		int puntos = 0;
		if (diasAlquilados > 1) {
			puntos++;
		}

		return super.calcularPuntos(diasAlquilados) + puntos;
	}

}
