package roulette;

/**
 * A modified child wheel class to get rid of the randomness for testing purposes
 * 
 * @author Nicholas Nguyen
 *
 */

public class TestWheel extends Wheel {

	public void setNumber(int value)
	{
		this.myValue = value;
	}
}
