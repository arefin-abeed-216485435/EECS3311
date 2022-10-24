package Analysis;

import java.util.ArrayList;

public class Analysis5 {
	NumberOfData y = new OneData("GovtExpOnEdu");
	DataForAnalysis data;
	public Analysis5(String country, int from, int to) {
		// TODO Auto-generated constructor stub
		data = new AveargeForPie(country, from, to, y);
	}

	public ArrayList<String> getData() {
		// TODO Auto-generated method stub
		return data.getData();
	}


}
