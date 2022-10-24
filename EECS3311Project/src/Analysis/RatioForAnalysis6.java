package Analysis;

import java.util.ArrayList;

public class RatioForAnalysis6 extends Ratio{

	public RatioForAnalysis6(String country, int from, int to, NumberOfData num) {
		super(country, from, to, num);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void compute(ArrayList<Float> info1, ArrayList<Float> info2, ArrayList<Float> info3) {
		// TODO Auto-generated method stub
		list.add("Year:" + "HealthExpPer1000People" + "/" + type[1]);
		for(int i = info1.size() - 2; i >= 0; i--) {
			float resultc = (info1.get(i) * 1000) / info2.get(i);
				list.add(from++  + ":" + resultc);
		}
	}
}
