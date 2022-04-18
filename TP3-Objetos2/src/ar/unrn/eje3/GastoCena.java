package ar.unrn.eje3;

public class GastoCena extends Gasto {

	private final String nombre = "Cena";
	private int monto;

	public GastoCena(int monto) {
		super();
		this.monto = monto;
	}

	public String reporte() {

		return nombre + "\t" + this.monto + "\t" + this.marcaExcesoComidas() + System.lineSeparator();
	}

	public int montoComida() {

		return this.monto;
	}

	public String marcaExcesoComidas() {

		if (this.monto > 5000) {
			return "X";
		}

		return " ";
	}

	@Override
	public int montoTotal() {

		return this.monto;
	}

}
