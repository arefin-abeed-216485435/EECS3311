package Analysis;

public class TwoData implements NumberOfData{
	String[] result;
	int key;
	
	public TwoData(String x, String y) {
		String[] temp = {x, y};
		result = temp;
	}

	@Override
	public String[] numData() {
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public int key() {
		// TODO Auto-generated method stub
		key = 2;
		return 2;
	}

}
