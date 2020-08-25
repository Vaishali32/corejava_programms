package testprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDescending {

	public static void main(String[] args) {
		List <Integer> numlist = new ArrayList<Integer>();
		numlist.add(12);
		numlist.add(23);
		numlist.add(85);
		numlist.add(24);
		numlist.add(56);
		System.out.println("Orignal list" + numlist);
		Collections.sort(numlist, Collections.reverseOrder());
		//for(Integer n: numlist) {System.out.println(n);}
		System.out.println("Descending order" + numlist);
	}

}
