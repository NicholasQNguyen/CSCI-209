/**
 * Class to test out MediaItem and it's subclasses with a list instead of an array
 * 
 * @author Nicholas Nguyen
 */
package edu.wlu.cs.nguyennq23;

import java.util.*;

/**
 * 
 *
 */
public class CollectionDriver {

	public static void main(String[] args)
	{
		//Make 2 of each kind of object
		CD cd1 = new CD("I'll put you in misery", true, 33, 2021, "TUYU", 12);
		CD cd2 = new CD("It's Raining After All", true, 34, 2020, "TUYU", 11);
		
		DVD dvd1 = new DVD("I Want to Eat Your Pancreas", true, 108, 2019, "13+", 10);
		DVD dvd2 = new DVD("Rush Hour", true, 97, 1999, "PG-13", 20);
		
		AudioBook ab1 = new AudioBook("No Longer Human", true, 253, 1948, "Osamu Dazai", "danosarchive");
		AudioBook ab2 = new AudioBook("Kokoro", true, 428, 1957, "Natsume Soseki", "Matt Shea");
		
		//Make a list and store the objects in it
		List<MediaItem> library = new ArrayList<>();
		library.add(cd1);
		library.add(cd2);
		library.add(dvd1);
		library.add(dvd2);
		library.add(ab1);
		library.add(ab2);
		
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
			library.get(i).setInCollection(false);
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
		//https://stackoverflow.com/questions/16252269/how-to-sort-an-arraylist
		Collections.sort(library);
		System.out.println("The library in alphabetical order: ");
		//https://www.tutorialspoint.com/get-the-size-of-an-arraylist-in-java#:~:text=The%20size%20of%20an%20ArrayList%20can%20be%20obtained%20by%20using,the%20ArrayList%20i.e.%20the%20size. 
		for (int i = 0; i < library.size(); i++)
		{
			System.out.print((i + 1) + ")");
			System.out.println(library.get(i).getTitle());
		}
	}
}
