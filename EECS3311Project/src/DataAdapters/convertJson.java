package DataAdapters;

import java.util.ArrayList;

import com.google.gson.JsonArray;

public class convertJson {
	ArrayList<String> list = new ArrayList<String>();     
	public convertJson() {
		
	}
	public ArrayList<String> convertToString(JsonArray jarray) {

		String resultFortheYear = "";
		int size = jarray.size();
		int sizeOfResults = jarray.get(1).getAsJsonArray().size();
		int year;
		for (int i = 0; i < sizeOfResults; i++) {
			year = jarray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("date").getAsInt();
			if (jarray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull())
				resultFortheYear = "0";
			else
				resultFortheYear = jarray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value")
						.getAsString();
			String result = year + ":" + resultFortheYear;
			list.add(result);

		}
		return list;
	}
}
