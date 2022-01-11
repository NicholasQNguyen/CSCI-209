/**
 * 
 */
package test;

import static org.junit.Assert.assertThrows;
/**
 * @author manayen23
 *
 */

import static org.junit.jupiter.api.Assertions.*;

import car.Car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Nobel Manaye, Benjamin Slater, Nicholas Nguyen
 *
 */

class gotest {

	
	private Car testCar;
	private final double ERRORTOLERANCE = 0.0001;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		//Set it up such that the car is geared forward
		testCar = new Car();
		testCar.setGear(Car.FORWARD);
	}

	@Test
	public void negativeMileageTest()
	{
		//try to go a negative distance and check for an illegal argument error
		testCar.go(testCar.getMPG()*testCar.getRemainingGas()*-1);
		assertThrows(IllegalArgumentException.class, () -> {
		testCar.getRemainingGas();
		});
	}

	@Test
	public void nullMilesTest()
	{
		//try to go nowhere, check if the tank's gas and location is unchanged
		testCar.go(0);
		assertEquals(50.0,testCar.getRemainingGas(),ERRORTOLERANCE);
		assertEquals(0.0, testCar.getLocation(), ERRORTOLERANCE);
	}

	@Test
	public void goWhileInParkTest()

	{

		//try to move the car while it is on park, should return an Illegal state error
		testCar.setGear(Car.PARK);
		assertThrows(IllegalStateException.class, () -> {
			testCar.go(2);

			});

	}
	
	@Test
	public void fullTankMileTest()
	{
		//Try to burn out the fuel by going out to the maximum distance, should return zero for the remaining code.
		
		testCar.go(testCar.getMPG()*testCar.getRemainingGas());
		assertEquals(0.0,testCar.getRemainingGas(),ERRORTOLERANCE);
		assertEquals(testCar.getMPG()*testCar.getRemainingGas(), testCar.getLocation(), ERRORTOLERANCE);
		
	}
	
	@Test
	public void reversefullTankMileTest()
	//Try to burn out the fuel by going out to the maximum distance, should return zero for the remaining code., but in backwards gear. 
	{
		testCar.setGear(Car.REVERSE);
		testCar.go(testCar.getMPG()*testCar.getRemainingGas());
		assertEquals(0.0,testCar.getRemainingGas(),ERRORTOLERANCE);
		assertEquals(-1*testCar.getMPG()*testCar.getRemainingGas(), testCar.getLocation(), ERRORTOLERANCE);
		
	}

	

	@Test
	public void insufficientFuelJourneyTest()
	{
		//Try to burn out the fuel by going out to more than the maximum distance, check an empty gas tank and an appropriate location
		testCar.go(testCar.getMPG()*testCar.getRemainingGas()+500);
		assertEquals(0.0,testCar.getRemainingGas(),ERRORTOLERANCE);
		assertEquals(testCar.getMPG()*testCar.getRemainingGas(), testCar.getLocation(), ERRORTOLERANCE);

	}

	@Test
	public void reverseInsufficientFuelJourneyTest()
	{
		//Try to burn out the fuel by going out to more than the maximum distance in reverese, check an empty gas tank and an appropriate location
		testCar.setGear(Car.REVERSE);
		testCar.go(testCar.getMPG()*testCar.getRemainingGas()+500);
		assertEquals(0.0,testCar.getRemainingGas(),ERRORTOLERANCE);
		assertEquals(-1*testCar.getMPG()*testCar.getRemainingGas(), testCar.getLocation(), ERRORTOLERANCE);

	}
	
	@Test
	public void ReversenegativeMileageTest()
	{
		//Reverse mode, try to go a negative distance, should return an error.
		testCar.setGear(Car.REVERSE);
		testCar.go(testCar.getMPG()*testCar.getRemainingGas()*-1);
		assertThrows(IllegalArgumentException.class, () -> {
		testCar.getRemainingGas();
		});
	}
	
}

