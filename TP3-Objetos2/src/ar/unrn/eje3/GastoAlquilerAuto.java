package ar.unrn.eje3;

public class GastoAlquilerAuto extends Gasto {

	private final String nombre = "Alquiler de Autos";
	private int monto;

	public GastoAlquilerAuto(int monto) {
		super();
		this.monto = monto;
	}

	@Override
	public String reporte() {

		return nombre + "\t" + this.monto + "\t" + this.marcaExcesoComidas() + System.lineSeparator();
	}

	@Override
	public int montoTotal() {

		return this.monto;
	}

	@Override
	public String marcaExcesoComidas() {

		return " ";
	}

}
