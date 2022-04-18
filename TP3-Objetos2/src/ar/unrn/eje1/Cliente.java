package ar.unrn.eje1;

public class Cliente {

	private Alquileres alquileres = new Alquileres();
	private String name;

	public Cliente(String nombre) {
		this.name = nombre;
	}

	public Object[] calcularDeudaYPuntosObtenidos() {

		return alquileres.calcularDeudaYPuntosObtenidos();

	}

	public void alquilar(Alquiler rental) {
		alquileres.alquilar(rental);
	}
}