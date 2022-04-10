package ejercicio1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ar.unrn.eje1.Alquiler;
import ar.unrn.eje1.Cliente;
import ar.unrn.eje1.CopiaLibro;
import ar.unrn.eje1.Libro;
import ar.unrn.eje1.LibroInfantil;
import ar.unrn.eje1.LibroNuevoLanzamiento;
import ar.unrn.eje1.LibroRegular;

public class TestCalculoDePago {

	@Test
	void test() {

		// SET UP
		// crea los libros
		/*
		 * Libro elTunel = new Libro("El Túnel", Libro.REGULARES); Libro antesDelFin =
		 * new Libro("Antes del Fin", Libro.REGULARES); Libro elSol = new
		 * Libro("El Sol", Libro.INFANTILES); Libro laLuna = new Libro("La Luna",
		 * Libro.NUEVO_LANZAMIENTO);
		 */

		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");
		Libro elSol = new LibroInfantil("El Sol");
		Libro laLuna = new LibroNuevoLanzamiento("La Luna");

		// hace las copias
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
		CopiaLibro elSolCopia = new CopiaLibro(elSol);
		CopiaLibro laLunaCopia = new CopiaLibro(laLuna);

		// crea el alquiler
		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
		Alquiler alquilerElSol = new Alquiler(elSolCopia, 4);
		Alquiler alquilerLaLuna = new Alquiler(laLunaCopia, 4);

		// crea el cliente
		Cliente yo = new Cliente("Javier");

		// alquila los libros
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);
		yo.alquilar(alquilerElSol);
		yo.alquilar(alquilerLaLuna);

		// Resultados esperados
		double resultadoEsperadoResultado0 = 25.0;
		int resultadoEsperadoResultado1 = 5;

		// EXERCISE
		// calcula la deuda y los puntos
		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

		// imprime un 10
		System.out.println(resultado[0]);
		// imprime un 2
		System.out.println(resultado[1]);

		// VERIFY
		assertEquals(resultadoEsperadoResultado0, resultado[0]);
		assertEquals(resultadoEsperadoResultado1, resultado[1]);

	}
}
