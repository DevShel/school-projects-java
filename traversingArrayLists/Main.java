package traversingArrayLists;

import java.util.*;

class Main {
  public static void main(String[] args) 
  {
    // declaring the ArrayList Values
	ArrayList<Integer> Values = new ArrayList<Integer>();
	// adding to the ArrayList
	for (int count = 1; count <= 5; count++)
	{
		Values.add(count);
	}
	
	// for-each loop
	System.out.print("Contents of Values: ");
	int sum = 0;
	for (int number = 0; number <5; number++)
	{
		System.out.print(Values.get(number) + " ");
		sum = sum + Values.get(number);
	}

	System.out.println();
	System.out.println("Sum of Values: " + sum);
  }

  // regular for loop (by index)
 
 /* System.out.print("Contents of Values: ");
	int sum = 0;
	for (int number = 0; number < Values.size(); number++)
	{
		System.out.print(Values.get(number) + " ");
		sum = sum + Values.get(number);
	}

	System.out.println();
	System.out.println("Sum of Values: " + sum);*/ 





  // while loop




 // enhanced for loop
 /*System.out.print("Contents of Values: ");
	int sum = 0;
	for (int number : Values)
	{
		System.out.print(number + " ");
		sum += number;
	}
	System.out.println();
	System.out.println("Sum of Values: " + sum);*/



}