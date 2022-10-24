package LoginPage;
import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
public class ReadCSV {
	private boolean exist = false;
	public ReadCSV(String filepath, String[] data) {
		try (
	            Reader reader = Files.newBufferedReader(Paths.get(filepath + ".csv"));
	            CSVReader readerCSV = new CSVReader(reader);
	        ) {
	            // Reading Records One by One in a String array
	            String[] reccord;
	            while ((reccord = readerCSV.readNext()) != null) {
	            	if(Arrays.asList(reccord).containsAll(Arrays.asList(data))) {
	            		exist = true;
	            		break;
	            	}
	            }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public boolean checkDataExist() {
		return exist;
	}
}
