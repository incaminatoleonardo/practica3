package ar.unrn.eje3;

import java.util.List;

public class Gastos {

	private List<Gasto> gastos;

	public Gastos(List<Gasto> gastos) {
		super();
		this.gastos = gastos;
	}

	public void añadirGastos() {

		Gasto gastoCena = new GastoCena(1);
		Gasto gastoDesayuno = new GastoDesayuno(2);
		Gasto gastoAlquilerAuto = new GastoAlquilerAuto(3);

		gastos.add(gastoCena);
		gastos.add(gastoDesayuno);
		gastos.add(gastoAlquilerAuto);

	}

	public String devolverGasto() {
		String reporte = "";
		for (Gasto gasto : gastos) {

			reporte = reporte + gasto.reporte();
		}
		return reporte;
	}

	public int devolverGastoComidas() {

		int gastosDeComida = 0;
		for (Gasto gasto : gastos) {

			gastosDeComida += gasto.montoComida();

		}

		return gastosDeComida;
	}

	public int devolverGastoTotal() {

		int gastoTotal = 0;
		for (Gasto gasto : gastos) {

			gastoTotal += gasto.montoTotal();
		}
		return gastoTotal;
	}

}
