/**
 * 
 */
package roulette;

/**
 * Class for a bet where you pick within a 2 number range
 * 
 * @author Nicholas Nguyen
 */
public class TwoInARowBet extends Bet {

	public TwoInARowBet() {
		super("Two in a Row", 17);
	}

	@Override
	public boolean checkForVictory(String betChoice, Wheel myWheel) {
		int start = Integer.parseInt(betChoice);
		return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 2);
	}

	@Override
	public String displayOptions() {
		result = ""
				+ ConsoleReader.promptRange(
						"Enter first of two consecutive numbers", 1, 34);
		return result;
	}
}
