package bingoGame;

class Main 
{
  public static void main(String[] args) 
  {
    String [] bingoString = {"B ", " I ", " N ", " G ", " O "};
	
    String[][] bingoBoard = new String[5][5];

    for (int i = 0; i < bingoString.length; i++)
	{
      System.out.print(bingoString[i]);
      System.out.print(" ");
    }
    for (int i = 0; i < 5 ; i++)
	{
      System.out.println(" ");
      bingoBoard[i][0] = Integer.toString(((int)(Math.random() * (16 - 1)) + 1));

      String.valueOf(bingoBoard[i][0]);
      System.out.print(bingoBoard[i][0] + "  ");

      bingoBoard[i][1] = Integer.toString(((int)(Math.random() * (31 - 16)) + 16));
      String.valueOf(bingoBoard[i][1]);
      System.out.print(bingoBoard[i][1] + "  ");

      bingoBoard[i][2] = Integer.toString(((int)(Math.random() * (46 - 31)) + 31));
      bingoBoard[2][2] = "F";
      System.out.print(bingoBoard[i][2] + "  ");

      bingoBoard[i][3] = Integer.toString(((int)(Math.random() * (61 - 46)) + 46));
      String.valueOf(bingoBoard[i][3]);
      System.out.print(bingoBoard[i][3] + "  ");

      bingoBoard[i][4] = Integer.toString(((int)(Math.random() * (75 - 61)) + 61));
      String.valueOf(bingoBoard[i][4]);
      System.out.print(bingoBoard[i][4] + "  ");
    }
  }
}