package testprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class CArraylist {

	public static void main(String[] args) {
		ArrayList<String> Ename = new ArrayList<String>();
		Ename.add("Rot");
		Ename.add("Ceser");
		Ename.add("Tommy");
		Ename.add("Rechal");
		Ename.add("Sammy");

		// Iterate Arraylist by using Iterator
		Iterator name = Ename.iterator();
		while (name.hasNext()) {
			System.out.println(name.next());
		}

		// Iterate byusing each for loop
		for (String n : Ename) {
			System.out.println(n);
		}

		// Convert List to Array
		Object[] namelist = Ename.toArray();
		System.out.println(Arrays.toString(namelist));

		String Listname[] = Ename.toArray(new String[Ename.size()]);
		System.out.println(Arrays.toString(Listname));
       
		//Reverse Arraylist
		Collections.reverse(Ename);
		Iterator names = Ename.iterator();
		while (names.hasNext()) {
			System.out.println(names.next());
		}

	}

}
