package horseBarnConsolidation;

public class Main
{
    public static void main (String[] args)
	{
		horseBarn barn = new horseBarn(7);
     	barn.spaces[0] = new Horse("Trigger", 1340);
     	barn.spaces[2] = new Horse("Silver",1210);
     	barn.spaces[5] = new Horse("Patches", 1350);
     	barn.spaces[6] = new Horse("Duke", 1410);

		 
     	System.out.println("BEFORE CONSOLIDATE");
     	System.out.println(barn);
     	barn.consolidate();
     	System.out.println("AFTER CONSOLIDATE");
     	System.out.println(barn);
   	}

}