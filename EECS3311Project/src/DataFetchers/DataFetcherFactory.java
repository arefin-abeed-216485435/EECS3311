package DataFetchers;

public class DataFetcherFactory {
	public BaseDataFetcher dataFetch(String info, String country, 
			int fromDate, int toDate) {
		if(info == "CarbonEmission") {
			return new CarbonEmissionDataFetcher(country, fromDate, toDate);
		} else if(info == "EnergyUse") {
			return new EnergyUseDataFetchers(country, fromDate, toDate);
		} else if(info == "ForestArea") {
			return new ForestAreaDataFetcher(country, fromDate, toDate);
		} else if(info == "GDPPerCapita") {
			return new GDPPerCapitaDataFetcher(country, fromDate, toDate);
		} else if(info == "GovtExpOnEdu") {
			return new GovtExpOnEduDataFetcher(country, fromDate, toDate);
		} else if(info == "HealthExpOnePerson") {
			return new HealthExpOnePersonDataFetcher(country, fromDate, toDate);
		} else if(info == "HealthExpToGDP") {
			return new HealthExpToGDPDataFetcher(country, fromDate, toDate);
		} else if(info == "HospitalBeds") {
			return new HospitalBedsDataFetcher(country, fromDate, toDate);
		} else if(info == "MortalityRate") {
			return new MortalityRateDataFetcher(country, fromDate, toDate);
		} else if(info == "PMAirPollution") {
			return new PMAirPollutionDataFetcher(country, fromDate, toDate);
		} else if(info == "ProbHealthAccess") {
			return new ProbHealthAccessDataFetcher(country, fromDate, toDate);
		} else {
			return null;
		}
	}
}
