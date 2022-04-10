package ar.unrn.eje1;

public class Alquiler {
	private CopiaLibro copia;
	private int diasAlquilados;

	public Alquiler(CopiaLibro copia, int diasAlquilados) {
		this.copia = copia;
		this.diasAlquilados = diasAlquilados;
	}

	public int diasAlquilados() {
		return this.diasAlquilados;
	}

	public CopiaLibro copia() {
		return this.copia;
	}

	public double calcularDeuda() {

		return copia.calcularDeuda(this.diasAlquilados);
	}

	public int calcularPuntos() {

		return copia.calcularPuntos(this.diasAlquilados);
	}
}
