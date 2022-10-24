package Analysis;

import java.util.ArrayList;

public class Analysis8 {
	NumberOfData y = new TwoData("GovtExpOnEdu", "HealthExpToGDP");
	DataForAnalysis data;
	public Analysis8(String country, int from, int to) {
		// TODO Auto-generated constructor stub
		data = new AnnualPercChange(country, from, to, y);
	}

	public ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return data.getData();
	}
}
