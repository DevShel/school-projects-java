package arraySearchStatistics;

class Main {
    public static void main(String[] args) 
    {
      double[] numList = {92.9, 2.3, 49.3, 2.4, 1110.0, 0.12345};
      double max = numList[0];
      double min = numList[0];
      double sum = 0;
      double average = 0;
      for (double num: numList)
      {
        if (num > max)
        {
          max = num;
        }
        if (num < min)
        {
          min = num;
        }
        sum += num;
        average += (sum / numList.length);
      }
      System.out.println("The maximum value in the array is: " + max);
      System.out.println("The minimum value in the array is: " + min);
      System.out.println("The sum of the array is: " + sum);
      System.out.println("The average in the array is: " + average);
  
    }
  }