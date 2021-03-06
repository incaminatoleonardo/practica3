package ejercicio3;

import java.util.ArrayList;

import ar.unrn.eje3.Gasto;
import ar.unrn.eje3.Gastos;
import ar.unrn.eje3.ReporteDeGastos;

public class MainPrueba {

	public static void main(String[] args) {
		Gastos gastos = new Gastos(new ArrayList<Gasto>());

		gastos.aņadirGastos();
		ReporteDeGastos reporteGastos = new ReporteDeGastos(gastos);
		// reporteGastos.aņadirGastos();

		// String resultadoEsperado = "Expenses " + LocalDate.now() +
		// System.lineSeparator() +

		String resultadoEsperado = "Expenses 2022-04-17\r\n" + "Cena	1	 \r\n" + "Desayuno	2	 \r\n"
				+ "Alquiler de Autos	3	 \r\n" + "Gastos de comida: 3\r\n" + "Total de gastos: 6";

		System.out.println(reporteGastos.imprimir()); //
		// imprime bien pero me cuesta hacer
		// el resultadoEsperado
		System.out.println(resultadoEsperado);
		System.out.println("");

		/*
		 * Expenses 2022-04-10 Cena 1 Desayuno 2 Alquiler de Autos 3 Gastos de comida: 3
		 * Total de gastos: 6
		 * 
		 */

	}

}
