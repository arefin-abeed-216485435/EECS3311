package Analysis;

public class ThreeData  implements NumberOfData{
	String[] result;
	int key;
	
	public ThreeData(String x, String y, String z) {
		String[] temp = {x, y, z};
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
		key = 3;
		return key;
	}

}
