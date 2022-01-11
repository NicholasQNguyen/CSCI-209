package test;

import static org.junit.jupiter.api.Assertions.*;

import car.Car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A JUnit test class that tests when the cars are first built
 * 
 * @author Nobel Manaye, Benjamin Slater, Nicholas Nguyen
 *
 */

public class ConstructorTest 
{
	Car testCar;
	
	// Establish an error tolerance for double checking
	final double ERRORTOLERANCE = .001;
	
	/**
	 * Creates a car object before each test
	 */
	@BeforeEach
	public void testCarConstructor() 
	{
		testCar = new Car();
	}
	/**
	 * Tests parameters that aren't specified in the car constructor
	 * (The Gear, the Location, the RemainingGas)
	 */
	@Test
	public void testNotSetParameters()
	{
		// Should start in Park when it is constructed
		assertEquals(Car.PARK, testCar.getGear());
		
		// Should start at position 0.0 when it is constructed
		assertEquals(0.0, testCar.getLocation(), ERRORTOLERANCE);
		
		// Should start at max gas when it is constructed
		assertEquals(10.0, testCar.getRemainingGas(), ERRORTOLERANCE);
	}
}
