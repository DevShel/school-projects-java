package cardSortingProject;
import java.util.*;

/* Unfinished WIP*/


class Main
{
    public static Scanner input = new Scanner(System.in);
    public static int valueAce = 0;
    public static int valueOf(String c)
  {
    String initialPosition = c.substring(0,1);
    if (initialPosition.equals("A") && valueAce == 0)
	{
      while(valueAce < 1 || valueAce > 11){
        System.out.println("What is the value of the ACE card? 1-11");
        valueAce = input.nextInt();
        if(valueAce < 1 || valueAce > 11)
          System.out.println("INVALID ENTRY");
      }
      return valueAce;
    }
    else if (initialPosition.equals("A"))
      return valueAce;
    else if ((initialPosition.equals("1")) || (initialPosition.equals("J")) || (initialPosition.equals("Q")) || (initialPosition.equals("K")))
      return 10;
    else
      return Integer.parseInt(initialPosition);
  }
    

    public static String drawCard(ArrayList<String> D)
    {
        int randomIndex = (int) (Math.random() * D.size());
        String randomCard = D.get(randomIndex);
        D.remove(randomCard);
        return randomCard;
    }

    public static void SortCards(ArrayList<String> elements)
	{  
        for (int i = 0; i < elements.size() - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < elements.size(); j++)
			{  
                if (valueOf(elements.get(j)) < valueOf(elements.get(index)))
				{  
                    index = j;
                }  
            }
            String temp = elements.get(index);   
            elements.set(index, elements.get(i));
            elements.set(i, temp);  
        }  
    }  

    public static void returny (ArrayList<String> elements, ArrayList<String> cardSorter)
	{
      int min = valueOf(elements.get(0));
      for(int i = 1; i < elements.size(); i++)
	  {
        if (valueOf(elements.get(i)) < min){
          min = valueOf(elements.get(i));
        } else {
          min = valueOf(elements.get(0));
        }
      }
      for (int e = 0; e < elements.size(); e++)
	  {
        if (valueOf(elements.get(e)) == min){
          cardSorter.add(elements.get(e));
          elements.remove(e);
        }
      }
    }
       
    public static void main(String[] args)
    {
      Scanner input = new Scanner (System.in);
        ArrayList<String> cardDeck = new ArrayList<String>(Arrays.asList(
            "A♠", "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠",
            "A♣", "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣",
            "A♦", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦",
            "A♥", "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥"));

        ArrayList<String> playersDeck = new ArrayList<String>();

        if (playersDeck.size() < 1){
          System.out.println(playersDeck);
          System.out.println("No cards");
        }

        int numCards = 3;
        for (int count = 1; count <= numCards; count++)
        {
            String card = drawCard(cardDeck);
            playersDeck.add(card);
        }
        System.out.println(playersDeck);

        SortCards(playersDeck);

        System.out.println(playersDeck);

        int totalValue = 0;
        for (String card : playersDeck)
        {
            totalValue += valueOf(card);
        }
        System.out.println(totalValue);
        returny(playersDeck, cardDeck);
        System.out.println(playersDeck);
        System.out.println(cardDeck);
  }
}


