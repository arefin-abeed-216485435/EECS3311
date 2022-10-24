package Analysis;

public class OneData implements NumberOfData {
	String[] result;
	int key;
	
	public OneData(String x) {
		String[] temp = {x};
		result = temp;
	}
	
	@Override
	public String[] numData() {
		// TODO Auto-generated method stub
		return result;
	}
	
	@Override
	public int key() {
		key = 1;
		return key;
	}

}
