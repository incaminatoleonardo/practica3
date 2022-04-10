package ar.unrn.eje1;

public class LibroRegular extends Libro {

	public LibroRegular(String nombre) {
		super(nombre);

	}

	@Override
	public double calcularDeuda(int diasAlquilados) {

		double monto = 2;
		if (diasAlquilados > 2)
			monto += (diasAlquilados - 2) * 1.5;

		return monto;
	}

	@Override
	public int calcularPuntos(int diasAlquilados) {

		return super.calcularPuntos(diasAlquilados);
	}
}
