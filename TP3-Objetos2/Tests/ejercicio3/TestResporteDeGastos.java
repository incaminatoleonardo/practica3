package ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ar.unrn.eje3.Gasto;
import ar.unrn.eje3.Gastos;
import ar.unrn.eje3.ReporteDeGastos;

class TestResporteDeGastos {

	@Test
	void test() {

		// SET UP
		Gastos gastos = new Gastos(new ArrayList<Gasto>());

		gastos.añadirGastos();
		ReporteDeGastos reporteGastos = new ReporteDeGastos(gastos);

		String resultadoEsperado = "Expenses " + LocalDate.now() + "\r\n" + "Cena	1	 \r\n" + "Desayuno	2	 \r\n"
				+ "Alquiler de Autos	3	 \r\n" + "Gastos de comida: 3\r\n" + "Total de gastos: 6";

		// EXERCISE

		// VERIFY
		assertEquals(resultadoEsperado, reporteGastos.imprimir());

	}

}
