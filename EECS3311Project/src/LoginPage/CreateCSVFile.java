package LoginPage;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
public class CreateCSVFile {
	public CreateCSVFile(String name) throws IOException {
		CSVWriter writer = new CSVWriter(new FileWriter(name));
		writer.close();
	}
}
