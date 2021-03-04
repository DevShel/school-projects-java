package numberPatterns;
import java.util.Scanner;

class printer 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
	System.out.print("Input an integer : ");
	int numInput = input.nextInt();
	numInput = numInput - 1;
    input.close();

	for (int i = 0; i <= numInput; i++)
	{
		System.out.println("");
		for (int repeat = 0; repeat <= i; repeat++)
		{
			System.out.print(1 + (1*repeat));
		}
		

	}

  }
}