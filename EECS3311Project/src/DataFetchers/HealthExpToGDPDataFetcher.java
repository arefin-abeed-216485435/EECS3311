package DataFetchers;

public class HealthExpToGDPDataFetcher extends BaseDataFetcher {
	String type = "SH.XPD.CHEX.GD.ZS";
	public HealthExpToGDPDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}
