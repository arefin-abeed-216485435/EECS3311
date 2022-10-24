package Analysis;

import java.util.ArrayList;

public class Analysis7 {
	NumberOfData y = new TwoData("ProbHealthAccess", "MortalityRate");
	DataForAnalysis data;
	public Analysis7(String country, int from, int to) {
		// TODO Auto-generated constructor stub
		data = new RawDataAnalysis(country, from, to, y);
	}

	public ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return data.getData();
	}
}
