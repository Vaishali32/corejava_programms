package testprogram;

import java.util.HashSet;
import java.util.Scanner;

public class CheckElementinHashSet {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		HashSet<String> p = new HashSet<String>();
		 p.add("Ram");
		 p.add("Gita");
		 p.add("Sham");
		 p.add("Rita");
		System.out.println(p.contains(s)); 
	}

}
