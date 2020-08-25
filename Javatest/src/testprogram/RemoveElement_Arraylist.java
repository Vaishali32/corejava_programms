package testprogram;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement_Arraylist {

	public static void main(String[] args) {
		List <Integer> numlist = new ArrayList<Integer>();
		numlist.add(12);
		numlist.add(23);
		numlist.add(85);
		numlist.add(24);
		numlist.add(56);
		System.out.println("Orignal list: "+ numlist);
        numlist.remove(1);
        System.out.println("After removing element value: "+ numlist);
	}

}
