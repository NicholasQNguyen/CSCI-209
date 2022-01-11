/**
 * Class to represent a CD.
 *
 * @author Nicholas Nguyen
 */
package edu.wlu.cs.nguyennq23;

/**
 * 
 *
 */
public class CD extends MediaItem {

	
	private String artist;
	private int numberOfTracks;
	/**
	 * @param title of the work
	 * @param inCollection a boolean
	 * @param playingTime an int in minutes
	 * @param copyrightYear an int
	 */
	public CD(String title, Boolean inCollection, int playingTime, int copyrightYear, String artist, int numberOfTracks) 
	{
		super(title, inCollection, playingTime, copyrightYear);
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
	}
	
	/**
	 * @return the artist as a string
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @return the numberOfTracks as an int
	 */
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	@Override
	/**
	 * Displays all the information about the CD.
	 * Order: title, artist, number of tracks, inCollection. playing time, copyright year
	 */
	public String toString() {
		return "CD: Title: " + title + ", Artist: " + artist + ", Number of tracks: " + numberOfTracks + ", Is it in the collection: "
				+ inCollection + ", Playing time (in minutes): " + playingTime + ", Copyright year: " + copyrightYear;
	}
	

	/**
	 * Tester main function to ensure that it works
	 * @param args
	 */
	public static void main(String[] args)
	{
		CD c = new CD("I'll put you in misery", true, 33, 2021, "TUYU", 12);
		System.out.println(c);
	}
	
}
