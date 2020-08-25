package testprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class HashMapKeyValues {

	public static void main(String[] args) {
		HashMap<String, String> Edetails = new HashMap<String, String>();
		Edetails.put("Ram", "Pune");
		Edetails.put("Jay", "Kharadi");
		Edetails.put("Sham", "Ahund");
		Edetails.put("Gita", "Dhanori");
		Edetails.put("Zebra", "Chiplun");
		
		//Check hashmap is empty
		System.out.println(Edetails.isEmpty());
		
		//Sort by keys
		
		ArrayList <String> str = new ArrayList<String>();
		 str.addAll(Edetails.keySet());
		Collections.sort(str);
		System.out.println("HashMap sort by Keys: "+ str);
		
		//sort by Values
		
		ArrayList <String> str1 = new ArrayList<String>();
		str1.addAll(Edetails.values());
		Collections.sort(str1);
		System.out.println("HashMap sort by values: "+ str1);
	}

}
