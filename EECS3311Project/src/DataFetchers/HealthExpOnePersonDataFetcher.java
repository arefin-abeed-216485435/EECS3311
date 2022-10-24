package DataFetchers;

public class HealthExpOnePersonDataFetcher extends BaseDataFetcher {
	String type = "SH.XPD.CHEX.PC.CD";
	public HealthExpOnePersonDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}

