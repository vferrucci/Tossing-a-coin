/**
*@author: Veronika Ferrucci
* The class Coin simulates a coin.
*/
import java.util.Random;
public class Coin
{
private String sideUp;
   
   /**the default constructor to set up 
   the initial side of the coin */
   public Coin()
   {
   toss();
   }//end default constructor
   
   /**The toss method simulates the tossing
   of the coin*/
   public void toss()
   {
   Random rand=new Random();
   if(rand.nextInt(2)==0)
   {
      sideUp="tails";
   }
   else
   {
      sideUp="heads";
   }
   }//end toss
   
   /*The method getSideUp returns the value
   of the side*/
   public String getSideUp()
   {
   return sideUp;
   }//end getSideUp

}//end Coin
