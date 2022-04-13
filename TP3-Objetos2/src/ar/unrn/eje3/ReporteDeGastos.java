package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;

enum TipoDeGasto {
	CENA, DESAYUNO, ALQUILER_AUTO

}

class Gasto {
	TipoDeGasto tipoGasto;
	int monto;

	public Gasto(TipoDeGasto tipoGasto, int monto) {
		super();
		this.tipoGasto = tipoGasto;
		this.monto = monto;
	}

}

public class ReporteDeGastos {

	private List<Gasto> gastos;

	public ReporteDeGastos(List<Gasto> gastos) {
		super();
		this.gastos = gastos;
	}

	public List<Gasto> añadirGastos() {

		Gasto gastoCena = new Gasto(TipoDeGasto.CENA, 1);
		Gasto gastoDesayuno = new Gasto(TipoDeGasto.DESAYUNO, 2);
		Gasto gastoAlquilerAuto = new Gasto(TipoDeGasto.ALQUILER_AUTO, 3);

		gastos.add(gastoCena);
		gastos.add(gastoDesayuno);
		gastos.add(gastoAlquilerAuto);

		return gastos;

	}

	public String imprimir(List<Gasto> gastos) {
		int total = 0;
		int gastosDeComida = 0;

		// System.out.println("Expenses " + LocalDate.now());
		String reporteCompleto = "Expenses " + LocalDate.now() + System.lineSeparator();

		for (Gasto gasto : gastos) {
			if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto == TipoDeGasto.DESAYUNO) {
				gastosDeComida += gasto.monto;
			}

			String nombreGasto = "";
			switch (gasto.tipoGasto) {
			case CENA:
				nombreGasto = "Cena";
				break;
			case DESAYUNO:
				nombreGasto = "Desayuno";
				break;
			case ALQUILER_AUTO:
				nombreGasto = "Alquiler de Autos";
				break;
			}

			String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
					|| gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " "; // PREGUNTAR
																									// ESTO!!!!!!!

			// System.out.println(nombreGasto + "\t" + gasto.monto + "\t" +
			// marcaExcesoComidas);
			reporteCompleto = reporteCompleto + nombreGasto + "\t" + gasto.monto + "\t" + marcaExcesoComidas
					+ System.lineSeparator();

			total += gasto.monto;
		}

		// System.out.println("Gastos de comida: " + gastosDeComida);
		reporteCompleto = reporteCompleto + "Gastos de comida: " + gastosDeComida + System.lineSeparator();

		// System.out.println("Total de gastos: " + total);
		reporteCompleto = reporteCompleto + "Total de gastos: " + total;

		// System.out.println(reporteCompleto);
		return reporteCompleto;
	}
}
