package testprogram;

public class MovieRelease implements Comparable <MovieRelease> {
	String redate; int rating;
	String moviename;
	
	MovieRelease (String moviename, int rating, String redate){
		this.moviename = moviename;
		this.rating = rating;
		this.redate = redate;
		
	}

	@Override
	public int compareTo(MovieRelease ra) {
		if(rating==ra.rating)  
			return 0;  
			else if(rating>ra.rating)  
			return 1;  
			else  
			return -1; 
	}
	public String toString() {
		return this.moviename+ " "+ this.rating+ " "+this.redate;
	}

}
