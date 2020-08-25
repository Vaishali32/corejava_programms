package testprogram;

import java.util.ArrayList;
import java.util.Collections;

public class Check_Comparator {

	public static void main(String[] args) {
		 ArrayList<Student> stdulist = new ArrayList<Student>();
		 stdulist.add(new Student(223, "Chaitanya", 26));
		 stdulist.add(new Student(245, "Rahul", 24));
		 stdulist.add(new Student(209, "Ajeet", 32));

		   Collections.sort(stdulist, new Sortbyroll());
          System.out.println(stdulist);
	}

}
