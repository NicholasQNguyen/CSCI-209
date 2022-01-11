package roulette;

import java.util.*;

/**
 * Class for a red or black bet
 * 
 * @author Nicholas Nguyen
 */
public class RedBlackBet extends Bet {

	public RedBlackBet() {
		super("Red or Black", 1);
	}

	@Override
	public boolean checkForVictory(String betChoice, Wheel myWheel) {
		
		return myWheel.getColor().equals(betChoice);
	}

	@Override
	public String displayOptions() {
		Set<String> choices = new TreeSet<String>();
		choices.add(Wheel.BLACK);
		choices.add(Wheel.RED);
		
		return(ConsoleReader.promptOneOf("Please bet", choices));
		
	}

}
