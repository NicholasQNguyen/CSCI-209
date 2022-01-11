/*
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import car.Car;
/**
 * @author Nobel Manaye, Benjamin Slater, Nicholas Nguyen
 */
class SetterTest {

	private Car testCar;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	void setUp() throws Exception {
		//setup the Car object
		testCar = new Car();
		
	}

	@Test
	void setgear() 
	{
		//Test if the gear is set to appropriate values, and if so, check if it returns the appropriate value with the getter method
		
		testCar.setGear(Car.PARK);
		assertEquals(Car.PARK,testCar.getGear());
		
		assertThrows(IllegalArgumentException.class, () -> {
			testCar.setGear(-200);
			});

		assertThrows(IllegalArgumentException.class, () -> {
			testCar.setGear(400);
			});
		testCar.setGear(Car.FORWARD);
		assertEquals(Car.FORWARD,testCar.getGear());
		
		testCar.setGear(Car.REVERSE);
		assertEquals(Car.REVERSE,testCar.getGear());
		
		
		
	}

}
