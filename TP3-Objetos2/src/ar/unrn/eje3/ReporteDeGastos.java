package ar.unrn.eje3;

import java.time.LocalDate;

// aplicar collectinparametro

/*enum TipoDeGasto {
	CENA, DESAYUNO, ALQUILER_AUTO

}*/

public class ReporteDeGastos {

	private Gastos gastos;

	public ReporteDeGastos(Gastos gastos) {
		super();
		this.gastos = gastos;
	}

	public String imprimir() {

		String reporteCompleto = "Expenses " + LocalDate.now() + System.lineSeparator();

		reporteCompleto = reporteCompleto + gastos.devolverGasto();

		reporteCompleto = reporteCompleto + "Gastos de comida: " + gastos.devolverGastoComidas()
				+ System.lineSeparator();

		reporteCompleto = reporteCompleto + "Total de gastos: " + gastos.devolverGastoTotal();

		return reporteCompleto;
	}
}
