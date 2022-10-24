package DataFetchers;

public class MortalityRateDataFetcher extends BaseDataFetcher {
	String type = "SP.DYN.IMRT.IN";
	public MortalityRateDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}