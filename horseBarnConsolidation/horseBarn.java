package horseBarnConsolidation;

public class horseBarn
{
   public Horse[] spaces;

   /** Constructor that takes the number of stalls
    *param numStalls - the number of stalls in the barn
    */
   public horseBarn(int numStalls)
   {
     spaces = new Horse[numStalls];
   }

   /** Consolidates the barn by moving horses so that the horses are
    *  in adjacent spaces, starting at index 0, with no empty space between any two horses.
    */
    
   public void consolidate()
   {
	   
	   Horse[] newSpaces = new Horse[spaces.length];
	   int index = 0;
	   for (int i = 0; i < spaces.length; i++)
	   {
		   if (spaces[i] != null)
		   {
			   newSpaces[index] = spaces[i];
			   index++;
		   }
	   }
	   spaces = newSpaces;
	   
   }

   public String toString()
   {
     String result = "";
     Horse h = null;
     for (int i = 0; i < spaces.length; i++) {
       h = spaces[i];
       result = result + "space " + i + " has ";
       if (h == null) result = result + " null \n";
       else result = result + h.toString() + "\n";
     }
     return result;
   }
}