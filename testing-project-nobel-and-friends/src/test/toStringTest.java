/**
 * 
 */
package test;

/**
 * @author Nobel Manaye, Ben Slater, Nicholas Nguyen
 *Tests the toString method.
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import car.Car;

class toStringTest {
	private Car testCar;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		//Setup the Car object
		testCar = new Car();

	}

	@Test
	public void toStringTest()

	{
	
		
		//Print the expeceted values of the car, then check if the match the testcar. 
		String expected = "Tank Capacity: 10 \nMPG: 20 \nGas left: 10 \nGear: Park \nLocation: 0.0";
		assertEquals(expected, testCar.toString());
		
	}
	
	/*
	 * @Test public void mpgStringTest() {
	 * 
	 * String expected = '20'; assertEquals(expected, testCar.getMPG()); }
	 * 
	 * @Test public void gasRemainingStringTest() {
	 * 
	 * String expected = '10'; assertEquals(expected, testCar.getRemainingGas()); }
	 * 
	 * @Test public void gearStringTest() {
	 * 
	 * String expected = 'Park'; assertEquals(expected, testCar.getGear()); }
	 * 
	 * @Test public void locationStringTest() {
	 * 
	 * String expected = '0.0'; assertEquals(expected, testCar.getLocation()); }
	 */
	
	
	
}
