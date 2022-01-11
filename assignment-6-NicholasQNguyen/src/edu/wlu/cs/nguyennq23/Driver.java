/**
 * Class to test MediaItem and it's subclasses AudioBook, DVD, and CD.
 * 
 * @author Nicholas Nguyen
 * 
 */
package edu.wlu.cs.nguyennq23;

import java.util.Arrays;

/**
 * 
 *
 */
public class Driver {

	public static void main(String[] args)
	{
		//Make 2 of each kind of object
		CD cd1 = new CD("I'll put you in misery", true, 33, 2021, "TUYU", 12);
		CD cd2 = new CD("It's Raining After All", true, 34, 2020, "TUYU", 11);
		
		DVD dvd1 = new DVD("I Want to Eat Your Pancreas", true, 108, 2019, "13+", 10);
		DVD dvd2 = new DVD("Rush Hour", true, 97, 1999, "PG-13", 20);
		
		AudioBook ab1 = new AudioBook("No Longer Human", true, 253, 1948, "Osamu Dazai", "danosarchive");
		AudioBook ab2 = new AudioBook("Kokoro", true, 428, 1957, "Natsume Soseki", "Matt Shea");
		
		//Make an array and store the objects in it
		MediaItem[] library = new MediaItem[6];
		library[0] = cd1;
		library[1] = cd2;
		library[2] = dvd1;
		library[3] = dvd2;
		library[4] = ab1;
		library[5] = ab2;
		
		//test the accessor methods
		for (MediaItem element : library)
		{
			System.out.println("Title: " + element.getTitle());
			System.out.println("Is it in the library: " + element.getInCollection());
			System.out.println("Playing Time (in minutes): " + element.getPlayingTime());
			System.out.println("Copyright Year: " + element.getCopyrightYear());
			System.out.println("------");
		}
		
		//Check the first 3 items out of the library
		for (int i = 0; i <= 2; i++)
		{
			library[i].setInCollection(false);
		}
		//Check if they're in the library (should expect 3 false 3 true)
		for (MediaItem element : library)
		{
			System.out.print("Is \"" + element.getTitle() + "\" in the library? ");
			System.out.println(element.getInCollection());
		}
		
		System.out.print("\n");
		//print out all info about each item
		for (MediaItem element : library)
		{
			System.out.println(element);
		}
		
		System.out.print("\n");
		//Sort then print the array
		//https://stackoverflow.com/questions/18895915/how-to-sort-an-array-of-objects-in-java
		Arrays.sort(library);
		System.out.println("The library in alphabetical order: ");
		for (int i = 0; i < library.length; i++)
		{
			System.out.print((i + 1) + ")");
			System.out.println(library[i].getTitle());
		}
	}
}
