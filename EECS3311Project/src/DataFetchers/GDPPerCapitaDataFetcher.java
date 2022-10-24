package DataFetchers;

public class GDPPerCapitaDataFetcher extends BaseDataFetcher {
	String type = "NY.GDP.PCAP.CD";
	public GDPPerCapitaDataFetcher (String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}