package testprogram;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertHashSet_Array {

	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();
		 str.add("Pune");
		 str.add("Dhanori");
		 str.add("Vishrantwadi");
		 str.add("Lohgaon");
		 str.add("Kharadi");
		 str.add("Ahund");
      String cityarea[] = str.toArray(new String[str.size()]);
      System.out.println(Arrays.toString(cityarea));
	}

}
