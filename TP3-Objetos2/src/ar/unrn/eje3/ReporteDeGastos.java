package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;

// aplicar collectinparametro

/*enum TipoDeGasto {
	CENA, DESAYUNO, ALQUILER_AUTO

}*/

public class ReporteDeGastos {

	private List<Gasto> gastos;

	public ReporteDeGastos(List<Gasto> gastos) {
		super();
		this.gastos = gastos;
	}

	public List<Gasto> añadirGastos() {

		Gasto gastoCena = new GastoCena(1);
		Gasto gastoDesayuno = new GastoDesayuno(2);
		Gasto gastoAlquilerAuto = new GastoAlquilerAuto(3);

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
		String reporteCompleto2 = "Expenses " + LocalDate.now() + System.lineSeparator();

		for (Gasto gasto : gastos) {
			/*
			 * if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto ==
			 * TipoDeGasto.DESAYUNO) { gastosDeComida += gasto.monto; }
			 * 
			 * String nombreGasto = ""; switch (gasto.tipoGasto) { case CENA: nombreGasto =
			 * "Cena"; break; case DESAYUNO: nombreGasto = "Desayuno"; break; case
			 * ALQUILER_AUTO: nombreGasto = "Alquiler de Autos"; break; }
			 */

			reporteCompleto2 = reporteCompleto2 + gasto.reporte();
			gastosDeComida += gasto.montoComida();

			/*
			 * String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA &&
			 * gasto.monto > 5000 || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto
			 * > 1000 ? "X" : " ";
			 */

			// System.out.println(nombreGasto + "\t" + gasto.monto + "\t" +
			// marcaExcesoComidas);
			/*
			 * reporteCompleto = reporteCompleto + nombreGasto + "\t" + gasto.monto + "\t" +
			 * marcaExcesoComidas + System.lineSeparator();
			 */

			total += gasto.montoTotal();
		}

		// System.out.println("Gastos de comida: " + gastosDeComida);
		reporteCompleto2 = reporteCompleto2 + "Gastos de comida: " + gastosDeComida + System.lineSeparator();

		// System.out.println("Total de gastos: " + total);
		reporteCompleto2 = reporteCompleto2 + "Total de gastos: " + total;

		// System.out.println(reporteCompleto);
		return reporteCompleto2;
	}
}
