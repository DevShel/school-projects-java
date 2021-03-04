package ticTacToeProject;

class display
{
  public static void displayBoard(String[][] board)
  {
   for (int row = 0; row < 3; row ++)
   {
        for (int col = 0; col< 3; col++)
		{
          System.out.print(board[row][col] + " ");
        }
        System.out.println(" ");
    }
  }
}