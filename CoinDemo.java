/**
*@author: Veronika Ferrucci
* This program simulates tossing of a coin.
*First, it calls the default constructor to 
*assign the initial side to the coin.
*Then the program tosses the coin 20 times,
*and displays which side the coin is facing up each time.
*After that the program displays the number of times
*each side appeared.
*/

public class CoinDemo
{
   public static void main (String[] args)
   {
   String side;
   int count=0, count2=0;
   Coin coinSide=new Coin();//calls the default constructor
   System.out.println("The coin is initially facing " + coinSide.getSideUp() +"\n");
   
   //Toss the coin 20 times
   System.out.println("Tossing the coin 20 times");
   for (int i=0; i<20; i++)
   {
   coinSide.toss();
   side =coinSide.getSideUp();
      if(side=="heads")
      {
         count++;//calculates the number of "heads"
      }
      else
      {
         count2++;//calculates the number of "tails"
      }
   System.out.println(side);
   }//end for
   System.out.println("The program displayed heads " +count+ " times.");
   System.out.println("The program displayed tails " +count2+ " times.");
   }//end main
}//end CoinDemo
