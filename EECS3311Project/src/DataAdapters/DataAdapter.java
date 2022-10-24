package DataAdapters;

import java.util.ArrayList;

import com.google.gson.JsonArray;

public interface DataAdapter {
	public ArrayList<String> convertToString(JsonArray jarray);
}
