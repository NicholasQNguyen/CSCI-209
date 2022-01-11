package test;

import car.Car;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

/**
 * @author Nobel Manaye, Ben Slater, Nicholas Nguyen
 */
public class GetterTest {

	private Car testCar;
	final double ERRORTOLERANCE = .001;
	
	@BeforeEach
	public void setUp()
	{
		testCar = new Car();
	}
	
	@Test
	public void getRemainingGasTest()
	{
		assertEquals(10.0, testCar.getRemainingGas());
	}
	
	@Test
	public void getCapacityTest()
	{
		assertEquals(10.0, testCar.getCapacity(), ERRORTOLERANCE);
	}
	
	@Test
	public void getLocationTest()
	{
		assertEquals(0.0, testCar.getLocation(), ERRORTOLERANCE);
	}
	
	
	@Test
	public void getMPGTest()
	{
		assertEquals(20.0, testCar.getMPG(), ERRORTOLERANCE);
	}
	
	@Test
	public void getGearParkTest()
	{
		testCar.setGear(Car.PARK);
		//should be true because PARK = 0
		assertEquals(Car.PARK, testCar.getGear());
		
	}
	@Test
	public void getGearForwardTest()
	{
		testCar.setGear(Car.FORWARD);
		//FORWARD = 1 so this should be true
		assertEquals(Car.FORWARD, testCar.getGear());
		
	}
	@Test
	public void getGearReverseTest()
	{
		testCar.setGear(Car.REVERSE);
		//REVERSE = 2 so this should be true
		assertEquals(Car.REVERSE, testCar.getGear());
		
	}
	
}
