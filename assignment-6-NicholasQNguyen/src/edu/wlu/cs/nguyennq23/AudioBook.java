/**
 * Class to represent an AudioBook
 * 
 * @author Nicholas Nguyen
 */
package edu.wlu.cs.nguyennq23;

/**
 * 
 *
 */
public class AudioBook extends MediaItem{

	private String author;
	private String narrator;
	/**
	 * @param title
	 * @param inCollection
	 * @param playingTime
	 * @param copyrightYear
	 */
	public AudioBook(String title, Boolean inCollection, int playingTime, int copyrightYear, String author, String narrator) {
		super(title, inCollection, playingTime, copyrightYear);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.narrator = narrator;
	}
	/**
	 * @return the author as a string
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @return the narrator as a string
	 */
	public String getNarrator() {
		return narrator;
	}
	@Override
	/**
	 * Displays the info about the audio book.
	 * Order: title, author, narrator, inCollection, playing time, copyright year
	 */
	public String toString() {
		return "AudioBook: Title: " + title + ", Author: " + author + ", Narrator: " + narrator + ", Is it in the collection: "
				+ inCollection + ", Playing Time (in minutes): " + playingTime + ", Copyright year: " + copyrightYear;
	}
	
	/**
	 * Tester main function to ensure that it works
	 * @param args
	 */
	public static void main(String[] args)
	{
		AudioBook a = new AudioBook("No Longer Human", true, 253, 1948, "Osamu Dazai", "danosarchive");
		System.out.println(a);
	}

	
}
