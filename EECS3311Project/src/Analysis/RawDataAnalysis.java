package Analysis;

import java.util.ArrayList;

public class RawDataAnalysis extends DataForAnalysis{

	public RawDataAnalysis(String country, int from, int to, NumberOfData num) {
		super(country, from, to, num);
		// TODO Auto-generated constructor stub
	}

	@Override
	void compute(ArrayList<Float> info1, ArrayList<Float> info2, ArrayList<Float> info3) {
		// TODO Auto-generated method stub
		if (type.length < 2) {
			list.add("Year:" + type[0]);
			for(int i = info1.size() - 2; i >= 0; i--) {
				float resultc = info1.get(i);
				
					list.add(from++  + ":" + resultc);
				
			}
		} else if(type.length < 3) {
			list.add("Year:" + type[0] + "," + type[1]);
			for(int i = info1.size() - 2; i >= 0; i--) {
				float resultc = info1.get(i);
				float resulte = info2.get(i);
				
					list.add(from++  + ":" + resultc + "," + resulte);
				
			}
		}  else {
			list.add("Year:" + type[0] + "," + type[1] + ";" + type[2]);
			for(int i = info1.size() - 2; i >= 0; i--) {
				float resultc = info1.get(i);
				float resulte = info2.get(i);
				float resultpm = info3.get(i);
				
					list.add(from++  + ":" + resultc + "," + resulte + ";" + resultpm);
				
			}
		}
	}

	@Override
	boolean permit(NumberOfData num) {
		// TODO Auto-generated method stub
		if(num.key() >3) {
			error.infoBox(" Number of data more than expected", "Error");
			return false;
		} else {
			return true;
		}
	}

}
