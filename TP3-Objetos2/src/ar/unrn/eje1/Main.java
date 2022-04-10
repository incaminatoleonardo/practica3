package ar.unrn.eje1;

public class Main {
	public static void main(String args[]) {

		// crea los libros
		Libro elTunel = new LibroRegular("El Túnel");
		Libro antesDelFin = new LibroRegular("Antes del Fin");

		// hace las copias
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

		// crea el alquiler
		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		// crea el cliente
		Cliente yo = new Cliente("Javier");

		// alquila los libros
		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		// calcula la deuda y los puntos
		Object[] resultado = yo.calcularDeudaYPuntosObtenidos();

		// imprime un 10
		System.out.println(resultado[0]);
		// imprime un 2
		System.out.println(resultado[1]);
	}
}