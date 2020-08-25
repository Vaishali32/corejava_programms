package testprogram;

import java.util.HashSet;
import java.util.Iterator;

public class CHashset {

	public static void main(String[] args) {
		HashSet<String> p = new HashSet<String>();
		 p.add("Ram");
		 p.add("Gita");
		 p.add("Sham");
		 p.add("Rita");
		 
		 
		 Iterator pname = p.iterator();
		 while(pname.hasNext()) {System.out.println(pname.next());}
		 
	}

}
