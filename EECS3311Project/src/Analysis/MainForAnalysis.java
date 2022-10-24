package Analysis;

import java.util.ArrayList;

public class MainForAnalysis {
	public static void main(String[] args) {
	Analysis8 x = new Analysis8("CAN", 2000, 2012);
	ArrayList<String> list = x.getData();
	for (String element:list) {
		System.out.println(element);
	}
}
}
