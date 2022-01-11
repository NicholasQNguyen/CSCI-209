/**
 * 
 */
package test;

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
class Fueltest {
	Car testCar;
	private final double ERRORTOLERANCE = 0.01;
	
	@BeforeEach
	void setUp() throws Exception {
		testCar = new Car();
		// Empty the gas tank
		testCar.go(testCar.getMPG()*testCar.getRemainingGas());
		
	}
	@Test
	public void fillTankTest()

	{
		
		testCar.fillTank();
		assertEquals(10.0,testCar.getRemainingGas(),ERRORTOLERANCE);
		
	}
	@Test
	public void overfillTankTest()

	{
		
		testCar.refuel(30.0);
		assertEquals(10.0,testCar.getRemainingGas(),ERRORTOLERANCE);
		
	}
	@Test
	public void underfillTankTest()

	{
		
		testCar.refuel(5.0);
		assertEquals(5.0,testCar.getRemainingGas(),ERRORTOLERANCE);
		
	}
	@Test
	public void dontFillTankTest()

	{
		
		testCar.refuel(0);
		assertEquals(0,testCar.getRemainingGas(),ERRORTOLERANCE);
		
	}
	@Test
	public void errorFillTankTest()

	{
		
		assertThrows(IllegalArgumentException.class, () -> {
			testCar.refuel(-5.0);
			});
		
	}
}
	
	
	
