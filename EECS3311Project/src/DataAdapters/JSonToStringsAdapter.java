package DataAdapters;

import java.util.ArrayList;

import com.google.gson.JsonArray;

public class JSonToStringsAdapter implements DataAdapter{
	
	private convertJson list;
	public JSonToStringsAdapter() {
		
	}

	@Override
	public ArrayList<String> convertToString(JsonArray jarray) {
		// TODO Auto-generated method stub
       return list.convertToString(jarray);
	}
	
}
