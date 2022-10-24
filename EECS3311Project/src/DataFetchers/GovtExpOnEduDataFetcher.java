package DataFetchers;

public class GovtExpOnEduDataFetcher extends BaseDataFetcher {
	String type = "SE.XPD.TOTL.GD.ZS";
	public GovtExpOnEduDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}
