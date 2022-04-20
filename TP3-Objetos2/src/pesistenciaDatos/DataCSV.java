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

	private void agregar(Condicion c, List<String[]> results, int indice) {
		if (c.condicion(csvData.get(indice))) {
			results.add(csvData.get(indice));
		}
	}

	public List<String[]> filtrar(Condicion c) throws IOException {
		// hacer el leer cargarlo en una variable y preguntar por null

		if (this.csvData.size() == 0) {

			this.leer();

		}
		List<String[]> results = new ArrayList<String[]>();

		for (int i = 0; i < csvData.size(); i++) {
			this.agregar(c, results, i);

		}
		csvData = results;
		return results;
	}

}
