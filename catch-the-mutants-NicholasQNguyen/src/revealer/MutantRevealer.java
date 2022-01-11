package revealer;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import mutants.Mutant;
import testthetests.MutantMaker;

/**
 * Contains the test cases that will reveal the mutants. Creates a mutant that
 * will be used to run the tests against.
 * 
 * Do NOT run this class directly.
 * 
 * @author Shannon Duvall original concept
 * @author Sara Sprenkle refactoring, documentation
 */
public class MutantRevealer {

	// in typical JUnit classes, this variable would _not_ be static
	private static Mutant mutant;

	@BeforeAll
	public static void getMutant() {
		// gets the mutant we're going to try to reveal
		mutant = MutantMaker.getNextMutant();
	}

	@Test
	public void testMutant() {
		// just to get you started, here's one test
		String[] words = { "a", "ab", "abc" };
		assertEquals(mutant.thirdShortest(words), "abc");
		
		String[] words2 = {"a", "b", "bc", "bcd", "qr"};
		assertEquals(mutant.thirdShortest(words2), "bcd");
		String[] words3 = {"a", "b", "c", "de", "fg", "hij", "klm"};
		String result3 = mutant.thirdShortest(words3);
		assertTrue(result3,equals("hij") || result3.equals("and"));
	}


	@Test
	public void testThrowsIllegalArgumentException() {
		String[] words = { "a" };
		assertThrows(IllegalArgumentException.class, () -> {
			mutant.thirdShortest(words);
		});
		String[] words2 = {"a", "b"};
		assertThrows(IllegalArgumentException.class, () -> {
			mutant.thirdShortest(words2);
		});
		String[] words3 = {};
		assertThrows(IllegalArgumentException.class, () -> {
			//mutant.thirdShortest(words3);
		});
		
	}
}
