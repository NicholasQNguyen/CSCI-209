/**
 * Abstract class used by AudioBook, DVD, CD and other Medias
 * 
 * @author Nicholas Nguyen
 */
package edu.wlu.cs.nguyennq23;

/**
 * 
 *
 */
public abstract class MediaItem implements Comparable<MediaItem> 
{
	protected String title;
	protected Boolean inCollection;
	protected int playingTime;
	protected int copyrightYear;
	/**
	 * Constructor if all parameters are specified
	 * @param title
	 * @param inCollection
	 * @param playingTime
	 * @param copyrightYear
	 */
	public MediaItem(String title, Boolean inCollection, int playingTime, int copyrightYear) {
		super();
		this.title = title;
		this.inCollection = inCollection;
		this.playingTime = playingTime;
		this.copyrightYear = copyrightYear;
	}

	/**
	 * Constructor for if no inCollection is specified
	 * @param title
	 * @param playingTime
	 * @param copyrightYear
	 */
	public MediaItem(String title, int playingTime, int copyrightYear) {
		this(title, true, playingTime, copyrightYear);
	}

	/**
	 * @return the inCollection as a Boolean
	 */
	public Boolean getInCollection() {
		return inCollection;
	}

	/**
	 * @param inCollection: A true or false on whether or not it's in the collection
	 */
	public void setInCollection(Boolean inCollection) {
		this.inCollection = inCollection;
	}

	/**
	 * @return the title as a string
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the playingTime in minutes as an int
	 */
	public int getPlayingTime() {
		return playingTime;
	}

	/**
	 * @return the copyrightYear as an int
	 */
	public int getCopyrightYear() {
		return copyrightYear;
	}

	@Override
	public String toString() {
		return "MediaItem Title: " + title + ", Is it in the collection: " + inCollection + ","
				+ "Playing time: " + playingTime+ ", Copyright year=" + copyrightYear;
	}

	@Override
	/**
	 * https://stackoverflow.com/questions/6203411/comparing-strings-by-their-alphabetical-order
	 * Compares the titles
	 * @return an int a positive integer this is before o, a negative integer if this is after o, or a 0 if they're the same
	 */
	public int compareTo(MediaItem o) {
		return this.getTitle().compareTo(o.getTitle());
	}


}
