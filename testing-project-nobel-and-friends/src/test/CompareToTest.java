/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import car.Car;

/**
 * @author Nobel Manaye, Benjamin Slater, Nicholas Nguyen
 *
 */
class CompareToTest {

	private Car testCar;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		testCar = new Car();
	}
	
	@Test
	public void testCompareTo()
	{
		Car testCar2 = new Car();
		// Should return a 0 because they are both in the same location (0.0)
		assertEquals(0, testCar.compareTo(testCar2));
		
		Car testCar3 = new Car();
		testCar3.go(5.0);
		// Should return -1 because testCar3 went 5 miles and is ahead of testCar
		assertEquals(-1, testCar.compareTo(testCar3));
		
		Car testCar4 = new Car();
		testCar.go(4.0);
		// Should return 1 because testCar went 4 miles and is ahead of testCar4
		assertEquals(1, testCar.compareTo(testCar4));
	}

}
