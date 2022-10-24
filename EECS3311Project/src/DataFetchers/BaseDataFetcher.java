package DataFetchers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import DataAdapters.convertJson;

public class BaseDataFetcher {
	protected String country;
	protected String urlString; 
	protected int fromDate;
	protected int toDate;
	protected String typeData;
	protected ArrayList<String> list = new ArrayList<String>();     
	
	public void grab(String country, String typeData, int fromDate, int toDate) {
		urlString = String.format(
				"http://api.worldbank.org/v2/country/%1s/indicator/%2s?date=%1d:%2d&format=json", country, typeData, fromDate, toDate);
		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			if (responsecode == 200) {
				String inline = "";
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				sc.close();
				JsonArray jsonArray = new JsonParser().parse(inline).getAsJsonArray();
				convertJson result = new convertJson();
				list = result.convertToString(jsonArray);
	}
		} catch (IOException e) {
			// TODO Auto-generated catch block e.printStackTrace();
		}
}
	public void setInfo(String country, int fromData, int toDate) {
		this.country = country;
		this.fromDate = fromData;
		this.toDate = toDate;
	}
	public ArrayList<String> getInfo(){
		return list;
	}
	}
		
