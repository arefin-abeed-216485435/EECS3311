package Analysis;

import java.util.ArrayList;

public class Ratio extends DataForAnalysis{

	public Ratio(String country, int from, int to, NumberOfData num) {
		super(country, from, to, num);
		// TODO Auto-generated constructor stub
	}

	@Override
	void compute(ArrayList<Float> info1, ArrayList<Float> info2, ArrayList<Float> info3) {
		// TODO Auto-generated method stub
		list.add("Year:" + type[0] + "/" + type[1]);
		for(int i = info1.size() - 2; i >= 0; i--) {
			float resultc = info1.get(i) / info2.get(i);
				list.add(from++  + ":" + resultc);
		}
	}
	

	@Override
	boolean permit(NumberOfData num) {
		// TODO Auto-generated method stub
		if(!(num.key() == 2)) {
			error.infoBox(" Number of data more or less than expected", "Error");
			return false;
		} else {
			return true;
		}
	}

}
