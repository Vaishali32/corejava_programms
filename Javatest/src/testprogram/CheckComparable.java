package testprogram;

import java.util.ArrayList;
import java.util.Collections;

public class CheckComparable {

	public static void main(String[] args) {
		ArrayList<MovieRelease> str = new ArrayList<MovieRelease>();
		 str.add(new MovieRelease("Sholya" , 4, "20Dec2013" ));
		 str.add(new MovieRelease("Don" , 5, "12Aug2001" ));
		 str.add(new MovieRelease("Leggan" , 3, "06April2006" ));
		 str.add(new MovieRelease("Rustham" , 5, "20Dec2012" ));
		 
		 Collections.sort(str);
		 System.out.println(str);
		 
	}

}
