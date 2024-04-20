
public class Movies implements Comparable{

	private String moviename;
	private long id;
	private long rating;
	
	
	public Movies(String moviename, long id, long rating) {
		super();
		this.moviename = moviename;
		this.id = id;
		this.rating = rating;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
		
	}

