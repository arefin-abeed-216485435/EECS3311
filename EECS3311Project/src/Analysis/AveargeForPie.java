package Analysis;

import java.util.ArrayList;

public class AveargeForPie extends DataForAnalysis {

	public AveargeForPie(String country, int from, int to, NumberOfData num) {
		super(country, from, to, num);
		// TODO Auto-generated constructor stub
	}

	@Override
	void compute(ArrayList<Float> info1, ArrayList<Float> info2, ArrayList<Float> info3) {
		// TODO Auto-generated method stub
		list.add(type[0] + ", others");
		float total = 0;
		float years = 0;
		for(int i = info1.size() - 2; i >= 0; i--) {
			total = total + info1.get(i);
			years++;
		}
		float result = total / years;
		list.add("" + result + "," + (100-result));
	}

	@Override
	boolean permit(NumberOfData num) {
		// TODO Auto-generated method stub
		if(!(num.key() == 1)) {
			error.infoBox(" Number of data more or less than expected", "Error");
			return false;
		} else {
			return true;
		}
	}
	}
