package DataFetchers;

public class PMAirPollutionDataFetcher extends BaseDataFetcher {
	String type = "EN.ATM.PM25.MC.M3";
	public PMAirPollutionDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}
