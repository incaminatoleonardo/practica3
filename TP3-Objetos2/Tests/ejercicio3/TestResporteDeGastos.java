package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ar.unrn.eje3.ReporteDeGastos;

class TestResporteDeGastos {

	@Test
	void test() {

		// SET UP
		ReporteDeGastos reporteGastos = new ReporteDeGastos(new ArrayList());

		String resultadoEsperado = "Expenses " + LocalDate.now() + "\r\n" + "Cena	1	 \r\n" + "Desayuno	2	 \r\n"
				+ "Alquiler de Autos	3	 \r\n" + "Gastos de comida: 3\r\n" + "Total de gastos: 6";

		// System.out.println(reporteGastos.imprimir(reporteGastos.aņadirGastos()));

		// EXERCISE

		// VERIFY
		assertEquals(resultadoEsperado, reporteGastos.imprimir(reporteGastos.aņadirGastos()));

	}

}
