package DataFetchers;

public class HospitalBedsDataFetcher extends BaseDataFetcher {
	String type = "SH.MED.BEDS.ZS";
	public HospitalBedsDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}
