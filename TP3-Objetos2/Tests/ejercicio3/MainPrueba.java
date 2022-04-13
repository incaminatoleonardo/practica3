package ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

import ar.unrn.eje3.ReporteDeGastos;

public class MainPrueba {

	public static void main(String[] args) {
		ReporteDeGastos reporteGastos = new ReporteDeGastos(new ArrayList());

		//String resultadoEsperado = "Expenses " + LocalDate.now() + System.lineSeparator() + 
		
		System.out.println(reporteGastos.imprimir(reporteGastos.añadirGastos())); // imprime bien pero me cuesta hacer el resultadoEsperado
		
		

		/*
		 * Expenses 2022-04-10 
		 * Cena 1 
		 * Desayuno 2 
		 * Alquiler de Autos 3 
		 * Gastos de comida: 3
		 * Total de gastos: 6
		 * 
		 */

	}

}
