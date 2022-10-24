package Analysis;

import java.util.ArrayList;

public class Analysis6 {
	NumberOfData y = new TwoData("HealthExpOnePerson", "HospitalBeds");
	DataForAnalysis data;
	public Analysis6(String country, int from, int to) {
		// TODO Auto-generated constructor stub
		data = new RatioForAnalysis6(country, from, to, y);
	}

	public ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return data.getData();
	}
}
