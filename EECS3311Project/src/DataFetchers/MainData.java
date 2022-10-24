package DataFetchers;

import java.util.ArrayList;

public class MainData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		DataFetcherFactory x = new DataFetcherFactory();
		BaseDataFetcher y = x.dataFetch("ProbHealthAccess", "CAN", 1999, 2012);
		list = y.getInfo();
		for(String a:list) {
			System.out.println(a);
		}
	}

}
