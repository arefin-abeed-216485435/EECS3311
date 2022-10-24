package DataFetchers;

public class EnergyUseDataFetchers extends BaseDataFetcher {
	String type = "EG.USE.PCAP.KG.OE";
	public EnergyUseDataFetchers(String country, int fromDate, int toDate) {
		super.grab(country, type, fromDate, toDate);
	}
}
