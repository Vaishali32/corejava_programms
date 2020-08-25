package testprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckElementExist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List <Integer> numlist = new ArrayList<Integer>();
		numlist.add(12);
		numlist.add(23);
		numlist.add(85);
		numlist.add(24);
		numlist.add(56);
		System.out.println(numlist.contains(num));
	}

}
