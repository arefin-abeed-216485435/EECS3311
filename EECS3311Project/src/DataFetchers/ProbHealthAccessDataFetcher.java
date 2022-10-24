package DataFetchers;

public class ProbHealthAccessDataFetcher extends BaseDataFetcher {
	String type = "SH.ACS.MONY.Q1.ZS";
	public ProbHealthAccessDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}
