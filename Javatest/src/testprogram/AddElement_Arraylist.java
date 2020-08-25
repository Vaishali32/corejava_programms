package testprogram;

import java.util.ArrayList;

public class AddElement_Arraylist {

	public static void main(String[] args) {
		ArrayList<String> Ename = new ArrayList<String>();
		Ename.add("Rot");
		Ename.add("Ceser");
		Ename.add("Tommy");
		Ename.add("Rechal");
		Ename.add("Sammy");
		System.out.println("Orignal value : "+ Ename );
		
		Ename.add(2, "Sita");
		System.out.println("After adding element at index: "+ Ename);
		System.out.println(Ename.get(2));
	}

}
