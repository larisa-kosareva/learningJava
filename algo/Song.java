public class Song implements Comparable<Song> {
	String title;
	String artist;
	String raiting;
	String bpm;

	@Override
	public boolean equals(Object aSong){
		Song s = (Song) aSong;
		return getTitle().equals(s.getTitle());
	}

	@Override
	public int hashCode() {
		return title.hashCode();
	}

	public int compareTo(Song s) {
		return title.compareTo(s.getTitle());
	}

	Song(String t, String a, String r, String b) {
		title = t;
		artist = a;
		raiting = r;
		bpm = b;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRaiting() {
	 	return raiting;
	}

	public String getBpm() {
		return bpm;
	}

	@Override
	public String toString() {
		return "xyi" + title;
	}



	
}