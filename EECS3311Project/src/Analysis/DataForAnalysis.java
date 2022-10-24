package Analysis;

import java.util.ArrayList;

import DataFetchers.BaseDataFetcher;
import DataFetchers.DataFetcherFactory;
import LoginPage.PopUpMessage;

public abstract class DataForAnalysis {
	DataFetcherFactory x = new DataFetcherFactory();
	BaseDataFetcher y = new BaseDataFetcher();
	ArrayList<String> initial = new ArrayList<String>();
	ArrayList<String> list = new ArrayList<String>();
	PopUpMessage error = new PopUpMessage();
	
	String country;
	int from;
	int to;
	String[] type;
	NumberOfData num;

	public DataForAnalysis(String country, int from, int to, NumberOfData num) {
		this.country = country;
		this.from = from;
		this.to = to;
		this.num = num;
		type = num.numData();
		if(permit(num)) {
			this.grabData();
		}
	}
	
	private ArrayList<Float> grab(String str, String country, int from, int to) {
		ArrayList<Float> result = new ArrayList<Float>();
		y = x.dataFetch(str, country, from, to);
		initial = y.getInfo();
		for(String element:initial) {
			result.add(Float.parseFloat(element.substring(element.lastIndexOf(":") + 1)));
		}
		return result;
	}
	
	void grabData() {
		 ArrayList<Float> dataOne = new ArrayList<Float>();
			ArrayList<Float> dataTwo = new ArrayList<Float>();
			ArrayList<Float> dataThree = new ArrayList<Float>();
			if(type.length < 2) {
				dataOne = grab(type[0], country, from-1, to);
				dataTwo = null;
				dataThree = null;
			} else if (type.length < 3) {
				dataOne = grab(type[0], country, from-1, to);
				dataTwo = grab(type[1], country, from-1, to);
				dataThree = null;
			} else {
				dataOne = grab(type[0], country, from-1, to);
				dataTwo = grab(type[1], country, from-1, to);
				dataThree = grab(type[2], country, from-1, to);
			}
			compute(dataOne, dataTwo, dataThree);
	 }
	
	public ArrayList<String> getData() {
		return list;
	}
	
	 abstract void compute(ArrayList<Float> info1, ArrayList<Float> info2, ArrayList<Float> info3);
	 abstract boolean permit(NumberOfData num);
}
