package Analysis;

import java.util.ArrayList;

public class Analysis1 {
	
	NumberOfData y = new ThreeData("CarbonEmission", "EnergyUse", "PMAirPollution");
	DataForAnalysis data;
	public Analysis1(String country, int from, int to) {
		// TODO Auto-generated constructor stub
		data = new AnnualPercChange(country, from, to, y);
	}

	public ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return data.getData();
	}
	
}
