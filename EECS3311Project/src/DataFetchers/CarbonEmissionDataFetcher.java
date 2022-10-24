package DataFetchers;

public class CarbonEmissionDataFetcher extends BaseDataFetcher {
	String type = "EN.ATM.CO2E.PC";
	public CarbonEmissionDataFetcher(String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}
