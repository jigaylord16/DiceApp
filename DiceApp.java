//Jacob Gaylord
//jigaylord16@ole.augie.edu
//DiceApp.java
import java.util.Scanner;
import java.util.Arrays;
public class Risk
{
  //Description: This program tests the dice class by asking the user to press
  //             enter to throw the dice and randomly genrating two values and
  //             computing their sum. It is then displayed on the screen and
  //             prompts the user until the program is ended.
  //Input:       The client enters the return key to throw the dice.
  //Output:      The dice values and their sum are printed on the screen.
  public static void main(String[] args)
  {
    int threshold = 1;
    Scanner input = new Scanner(System.in);
    System.out.print("Attacker armies: ");
    int attArmies = input.next();
    System.out.print("Defender armies: ");
    int defArmies = input.next();
    System.out.print("Threshold (1 for blitz): ")
    threshold = input.next();
    while (attArmies >= threshold || defArmies == 0)
    {
      if(attArmies >= 4 && defArmies >= 2)
      {
        Dice att1 = new Dice();
        Dice att2 = new Dice();
        Dice att3 = new Dice();
        Dice def1 = new Dice();
        Dice def2 = new Dice();
        int[3] attArr = {att1.getValue(), att2.getValue(), att3.getValue()};
        int[2] defArr = {def1.getValue(), def2.getValue()};
        Arrays.sort(attArr);
        Arrays.sort(defArr);
        if(attArr[2] > defArr[1])
          defArmies--;
        else
          attArmies--;
        if(attArr[1] > defArr[0])
          defArmies--;
        else
          attArmies--;
      }
      else if(attArmies >= 4 && defArmies < 2)
      {
        Dice att1 = new Dice();
        Dice att2 = new Dice();
        Dice att3 = new Dice();
        Dice def1 = new Dice();
        int[3] attArr = {att1.getValue(), att2.getValue(), att3.getValue()};
        Arrays.sort(attArr);
        if(attArr[2] < def1.getValue())
          defArmies--;
        else
          attArmies--;
      }
      else if(attArmies == 3 && defArmies >= 2)
      {
        Dice att1 = new Dice();
        Dice att2 = new Dice();
        Dice def1 = new Dice();
        Dice def2 = new Dice();
        int[2] attArr = {att1.getValue(), att2.getValue()};
        int[2] defArr = {def1.getValue(), def2.getValue()};
        Arrays.sort(attArr);
        Arrays.sort(defArr);
        if(attArr[1] > defArr[1])
          defArmies--;
        else
          attArmies--;
        if(attArr[0] > defArr[0])
          defArmies--;
        else
          attArmies--;
      }
      else if(attArmies == 3 && defArmies < 2)
      {
        Dice att1 = new Dice();
        Dice att2 = new Dice();
        Dice def1 = new Dice();
        int[2] attArr = {att1.getValue(), att2.getValue()};
        Arrays.sort(attArr);
        if(attArr[1] < def1.getValue())
          defArmies--;
        else
          attArmies--;
      }
      else if(attArmies == 2 && defArmies >= 2)
      {
        Dice att1 = new Dice();
        Dice def1 = new Dice();
        Dice def2 = new Dice();
        int[2] defArr = {def1.getValue(), def2.getValue()};
        Arrays.sort(defArr);
        if(att1.getValue() > defArr[1])
          defArmies--;
        else
          attArmies--;
      }
      else if(attArmies == 2 && defArmies < 2)
      {
        Dice att1 = new Dice();
        Dice def1 = new Dice();
        if(att1.getValue() > def1.getValue())
          defArmies--;
        else
          attArmies--;
      }
  }
  System.out.println("Attacking armies remaining: " +arrArmies);
  System.out.println("Defending armies remaining: " +defArmies);
}
