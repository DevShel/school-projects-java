package searchingListsTesting;
import java.util.*;


class Main 
{
	
	public static int sequentialSearch(ArrayList<Integer> arr, int target)
	{
		for(int i=0; i<arr.size();i++)
		{

				if(arr.get(i) == target)
				{
					return i;
				}

		}
		return -1;

	}
	public static int sequentialSearchStr(ArrayList<String> arr, String target)
	{
    for (int i = 0; i < arr.size(); i++)
	{
      if (arr.get(i).equals(target))
      	return i;
    }
    return -1;
  }


public static int binarySearch(ArrayList<Integer> arr, int target)
{
	int left = 0;
	int right = arr.size() -1;
	while(left<=right)
	{
		int middle = (left+right)/2;

		if(target<arr.get(middle))
		{
			right = middle -1;

		}
		else if(target> arr.get(middle))
		{

			left = middle +1;
		}
		else
		{
			return middle;
		}

	}
	return -1; //if not within list
}

  public static void main(String[] args) 
  {
		int a[] =  {72,74,89,67,58,86,95,100,100,100,92,96,78,63,66};

    ArrayList<Integer> gradesList = new ArrayList<Integer>();
		 for (int e = 0; e < a.length; e++){
      gradesList.add(a[e]);
    }
		int b[] = {44, 58, 63, 67, 72, 74, 78, 86, 89, 92, 95, 97, 100};
    ArrayList<Integer> sort = new ArrayList<Integer>();
    for (int e = 0; e < b.length; e++){
      sort.add(b[e]);
    }
		String Hamburger[] = {"Pickles", "Cheese", "Tomato", "Meat", "Onions", "Sauce", "Buns"};

    ArrayList<String> menu = new ArrayList<String>();
    for (int j = 0; j < Hamburger.length; j++)
	{
      menu.add(Hamburger[j]);
    }
		System.out.println(sequentialSearch(gradesList, 100));
    //Integer Seq Search Test Case
    System.out.println(sequentialSearch(gradesList, 999));
    //Integer Bin Search
    System.out.println(binarySearch(sort, 95));
    //Integer Bine Search Test Case
    System.out.println(binarySearch(sort, 999));
    //String Seq Search
    System.out.println(sequentialSearchStr(menu, "Hotdog"));
    //String Seq Search Test Case
    System.out.println(sequentialSearchStr(menu, "Taco"));
  }
}