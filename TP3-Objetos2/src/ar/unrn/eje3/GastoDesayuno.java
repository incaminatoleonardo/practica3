package ar.unrn.eje3;

public class GastoDesayuno extends Gasto {

	private final String nombre = "Desayuno";
	private int monto;

	public GastoDesayuno(int monto) {
		super();
		this.monto = monto;
	}

	@Override
	public String reporte() {

		return nombre + "\t" + this.monto + "\t" + this.marcaExcesoComidas() + System.lineSeparator();
	}

	public int montoComida() {

		return this.monto;
	}

	public String marcaExcesoComidas() {

		if (this.monto > 1000) {
			return "X";
		}

		return " ";
	}

	@Override
	public int montoTotal() {

		return this.monto;
	}

}
