package DataFetchers;

public class ForestAreaDataFetcher extends BaseDataFetcher {
	String type = "AG.LND.FRST.ZS";
	public ForestAreaDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}
