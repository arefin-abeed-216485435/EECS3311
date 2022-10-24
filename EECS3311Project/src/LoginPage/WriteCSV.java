package LoginPage;
import java.io.*;

import com.opencsv.CSVWriter;

public class WriteCSV {
	private String[] store;
	public WriteCSV(String[] list, String filepath) throws IOException {
		 File file = new File(filepath + ".csv");
		 if (file.exists()) {
			 write(list, filepath);
		 } else {
			 CreateCSVFile x = new CreateCSVFile(filepath + ".csv");
			 write(list, filepath);
		 }
	}
	private void write(String[] list, String filepath) {
		FileWriter writerFile;
		try {
			writerFile = new FileWriter(filepath + ".csv", true);
			CSVWriter writer = new CSVWriter(writerFile);
			store = list;
			writer.writeNext(list);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
