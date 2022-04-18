package ar.unrn.eje1;

import java.util.ArrayList;
import java.util.List;

public class Alquileres {

	private List<Alquiler> alquileres = new ArrayList<Alquiler>();

	public Object[] calcularDeudaYPuntosObtenidos() {
		Object[] resultado = new Object[2];
		double total = 0;
		int puntosAlquilerFrecuente = 0;
		for (Alquiler alquiler : alquileres) {
			double monto = 0;
			// determine amounts for each line
			monto = monto + alquiler.calcularDeuda();

			total += monto;
			// sumo puntos por alquiler
			puntosAlquilerFrecuente = puntosAlquilerFrecuente + alquiler.calcularPuntos();

		}
		resultado[0] = total;
		resultado[1] = puntosAlquilerFrecuente;
		return resultado;
	}

	public void alquilar(Alquiler rental) {
		alquileres.add(rental);
	}

}
