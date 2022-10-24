package Analysis;

import java.util.ArrayList;

public class AnnualPercChange extends DataForAnalysis{

	public AnnualPercChange(String country, int from, int to, NumberOfData num) {
		super(country, from, to, num);
		// TODO Auto-generated constructor stub
	}

	@Override
	void compute(ArrayList<Float> info1, ArrayList<Float> info2, ArrayList<Float> info3) {
		// TODO Auto-generated method stub
		if (type.length < 2) {
			list.add("Year:" + type[0]);
			for(int i = info1.size() - 1; i > 0; i--) {
				float resultc = Math.abs(((info1.get(i) - info1.get(i-1))/(info1.get(i)))*100);
				if(resultc == Double.POSITIVE_INFINITY) {
					list.add(from++ + ":" + "N/A"); 
				} else {
					list.add(from++  + ":" + resultc);
				}
			}
		} else if(type.length < 3) {
			list.add("Year:" + type[0] + "," + type[1]);
			for(int i = info1.size() - 1; i > 0; i--) {
				float resultc = Math.abs(((info1.get(i) - info1.get(i-1))/(info1.get(i)))*100);
				float resulte = Math.abs(((info2.get(i) - info2.get(i-1))/(info2.get(i)))*100);
				if(resultc == Double.POSITIVE_INFINITY) {
					list.add(from++ + ":" + "N/A" + "," + resulte); 
				} else if(resulte == Double.POSITIVE_INFINITY) {
					list.add(from++  + ":" + resultc + "," + "N/A"); 
				} else {
					list.add(from++  + ":" + resultc + "," + resulte);
				}
			}
		}  else {
			list.add("Year:" + type[0] + "," + type[1] + ";" + type[2]);
			for(int i = info1.size() - 1; i > 0; i--) {
				float resultc = Math.abs(((info1.get(i) - info1.get(i-1))/(info1.get(i)))*100);
				float resulte = Math.abs(((info2.get(i) - info2.get(i-1))/(info2.get(i)))*100);
				float resultpm = Math.abs(((info3.get(i) - info3.get(i-1))/(info3.get(i)))*100);
				if(resultc == Double.POSITIVE_INFINITY) {
					list.add(from++ + ":" + "N/A" + "," + resulte + ";" + resultpm); 
				} else if(resulte == Double.POSITIVE_INFINITY) {
					list.add(from++  + ":" + resultc + "," + "N/A" + ";" + resultpm); 
				} else if(resultpm == Double.POSITIVE_INFINITY) {
					list.add(from++  + ":" + resultc + "," + resulte + ";" + "N/A"); 
				} else {
					list.add(from++  + ":" + resultc + "," + resulte + ";" + resultpm);
				}
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
