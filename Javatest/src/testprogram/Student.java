package testprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public  class Student {
	 String studentname;
    int rollno;
     int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
    }
    
    public String toString() {
    	return this.rollno+ " "+this.studentage + " "+this.studentname;
    }
	
}

 class Sortbyroll implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		
		return a.rollno - b.rollno;
	}
	
}
 