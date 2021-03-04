package answerSheetProject;
import java.util.*;

class Main {
	 public static double getScore(ArrayList<String>key,ArrayList<String>answers)
		{
			int right = 0;
			int wrong = 0;
			for(int i = 0; i< key.size(); i++)
			{
				if(key.get(i).equals(answers.get(i)))
				{
					right++;
				}
				else if(key.get(i).equals("?"))
				{
					right= right + 0;
				}
				else
				{
					wrong++;

				}

			}
			double score = ((right*1)-(wrong*.25));
			return score;
    }
  public static void main(String[] args) 
  {
    ArrayList<String> answers = new ArrayList<String>(Arrays.asList ("A", "C", "D", "E", "B", "C", "B", "B", "B", "C"));
		ArrayList<String> key = new ArrayList<String>(Arrays.asList ("A", "B", "D", "E", "A", "C", "?", "B", "D", "C"));
        System.out.println("Your score: ");
		System.out.println(getScore(key,answers));

  }
}