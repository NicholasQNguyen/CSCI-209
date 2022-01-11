/**
 * Class to represent a DVD
 * 
 * @author Nicholas Nguyen
 */
package edu.wlu.cs.nguyennq23;

/**
 * 
 *
 */
public class DVD extends MediaItem {

	private String rating;
	private int bonusTime;
	/**
	 * @param title
	 * @param inCollection
	 * @param playingTime
	 * @param copyrightYear
	 */
	public DVD(String title, Boolean inCollection, int playingTime, int copyrightYear, String rating, int bonusTime) 
	{
		super(title, inCollection, playingTime, copyrightYear);
		this.rating = rating;
		this.bonusTime = bonusTime;
	}
	
	/**
	 * @return the rating as a String
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @return the time of the bonus features in minutes as an int
	 */
	public int getBonusTime() {
		return bonusTime;
	}
	
	@Override
	/**
	 * @return the sum of the playing time and the bonus feature time in minutes as an int
	 */
	public int getPlayingTime()
	{
		return playingTime + bonusTime;
	}
	
	@Override
	/**
	 * Displays the info about the DVD.
	 * Order: title, rating, playing time, bonus feature time, inCollection, copyright year
	 */
	public String toString() {
		return "DVD: Title: " + title + ", Rating: " + rating + ", Playing time (in minutes): " + getPlayingTime() + 
				", Bonus features time (in minutes): " + bonusTime + ", Is it in the collection: "+ inCollection + 
				", Copyright year: " + copyrightYear;
	}
	/**
	 * Tester main function to ensure that it works
	 * @param args
	 */
	public static void main(String[] args)
	{
		DVD d = new DVD("I Want to Eat Your Pancreas", true, 108, 2019, "13+", 10);
		System.out.println(d);
	}
	
}
