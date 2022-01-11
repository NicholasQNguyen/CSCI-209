package roulette;

import java.util.*;
/**
 * Class for a High (19-36) and Low (1-18) bet
 * 
 * @author Nicholas Nguyen
 */
public class HighLowBet extends Bet {

	public HighLowBet() {
		super("High or Low", 1);
	}

	@Override
	public boolean checkForVictory(String betChoice, Wheel myWheel) 
	{
		if (myWheel.getNumber() == 0 || myWheel.getNumber() == 37)
		{
			return false;
		}
		else
		{
			return (myWheel.getNumber() < 19 && betChoice.equals("low")
					|| myWheel.getNumber() >=19 && betChoice.equals("high"));			
		}
	}

	@Override
	String displayOptions() {
		{
			Set<String> choices = new TreeSet<String>();
			choices.add("high");
			choices.add("low");
			return(ConsoleReader.promptOneOf("Please bet", choices));
			
		}
	}

}
