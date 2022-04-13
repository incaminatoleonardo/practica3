package ejercicio3;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ar.unrn.eje3.ReporteDeGastos;

class TestResporteDeGastos {

	@Test
	void test() {

		ReporteDeGastos reporteGastos = new ReporteDeGastos(new ArrayList());

		System.out.println(reporteGastos.imprimir(reporteGastos.añadirGastos()));

	}

}
