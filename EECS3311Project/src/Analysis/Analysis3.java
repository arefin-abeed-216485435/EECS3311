package Analysis;

import java.util.ArrayList;

public class Analysis3 {
	
	NumberOfData y = new TwoData("CarbonEmission", "GDPPerCapita");
	DataForAnalysis data;
	public Analysis3(String country, int from, int to) {
		// TODO Auto-generated constructor stub
		data = new Ratio(country, from, to, y);
	}

	public ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return data.getData();
	}
}
