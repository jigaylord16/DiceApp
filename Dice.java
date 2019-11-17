//Jacob Gaylord
//jigaylord16@ole.augie.edu
//Dice.java
//Class Dice supports objects representing a throwing die.  Each die object knows its face value.
import java.util.Random;
public class Dice
{
	private int value;
  //Post:	TotalValue initialized to 0. This Die initialized randomly to a value
  //      in the range 1..6.
	public Dice()
	{
    value = 0;
    toss();
	}
  //Post:	This Die set randomly to a value in the range 1..6
	public void toss()
	{
    value = (int)(Math.random() * 6) + 1;
	}
  //Return:The face value of this Die1 object
	public int getValue()
	{
		return value;
	}
  //Return:	The value of these Dice in the format "Die1: value1 Die2:value2
  //        Total: totalValue"
	public String toString()
	{
    return "Die: " + value;
	}
}
