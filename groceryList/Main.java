package groceryList;
import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    String decide = "NO";
    ArrayList<String> listy = new ArrayList<String>();

    listy.add("Eggs");
    listy.add("Orange Juice");
    listy.add("Bacon");
    listy.add("Tater Tots");

    while (!decide.equals("Q"))
	{
      System.out.println("Grocery List: ");
      for (String item : listy)
	  {
        System.out.print("    ");
        System.out.println(item);
      }
      System.out.print("(Q)uit (A)dd or (R)emove item? ");
      decide = input.nextLine();

      if (decide.equals("Q") || decide.equals("q"))
	  {
        decide = "Q";
        break;
      } 
	  else if (decide.equals("A") || decide.equals("a"))
	  {
        System.out.print("Which item would you like to add? ");
        String addItem = input.nextLine();
        listy.add(addItem);
      } 

	  else if (decide.equals("R") || decide.equals("r"))
	  {
        System.out.print("Which item would you like to remove? ");
        String remItem = input.nextLine();
        listy.remove(remItem);
      } 
	  
	  else 
	  {
        System.out.println("INVALID INPUT");
      }
    }
    input.close();
  }
}