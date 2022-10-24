package Analysis;

import java.util.ArrayList;

public class Analysis2 {
	
	NumberOfData y = new TwoData("PMAirPollution", "ForestArea");
	DataForAnalysis data;
	public Analysis2(String country, int from, int to) {
		// TODO Auto-generated constructor stub
		data = new AnnualPercChange(country, from, to, y);
	}

	public ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return data.getData();
	}

}
