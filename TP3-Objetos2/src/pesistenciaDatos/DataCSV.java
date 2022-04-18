package pesistenciaDatos;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

import ar.unrn.eje2.Datos;

public class DataCSV implements Datos {

	private List<String[]> csvData = new ArrayList<String[]>();

	@Override
	public void leer() throws IOException {

		CSVReader reader = new CSVReader(new FileReader("data.csv"));
		String[] row = null;

		while ((row = reader.readNext()) != null) {
			csvData.add(row);
		}

		reader.close();
		csvData.remove(0);

	}

	public List<String[]> buscar(String columna, int numero) throws IOException {

		List<String[]> results = new ArrayList<String[]>(); // poner todo lo del if en un metodo en DataCSV

		for (int i = 0; i < csvData.size(); i++) {
			// borrar este buscar
		}

		return results;
	}

	private void agregar(Condicion c, List<String[]> results, int indice) {
		if (c.condicion(csvData.get(indice))) {
			results.add(csvData.get(indice));
		}
	}

	public List<String[]> filtrar(Condicion c) {
		List<String[]> results = new ArrayList<String[]>();

		for (int i = 0; i < csvData.size(); i++) {
			this.agregar(c, results, i);

//			if (c.condicion(csvData.get(i))) {
//				results.add(csvData.get(i));
//			}
		}
		csvData = results;
		return results;
	}

}
