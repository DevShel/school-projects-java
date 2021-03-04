package ticTacToeProject;

class win	
{
  public static String checkWinner(String[][] board) 
  {
    if (("X".equals(board[0][0]) && "X".equals(board[0][1]) && "X".equals(board[0][2])) || ("X".equals(board[1][0]) && "X".equals(board[1][1]) && "X".equals(board[1][2])) || ("X".equals(board[2][0]) && "X".equals(board[2][1]) && "X".equals(board[2][2])) || ("X".equals(board[0][0]) && "X".equals(board[1][0]) && "X".equals(board[2][0])) || ("X".equals(board[0][1]) && "X".equals(board[1][1]) && "X".equals(board[2][1])) || ("X".equals(board[0][2]) && "X".equals(board[1][2]) && "X".equals(board[2][2])) || ("X".equals(board[0][0]) && "X".equals(board[1][1]) && "X".equals(board[2][2])) || ("X".equals(board[2][0]) && "X".equals(board[1][1]) && "X".equals(board[0][2])))
	{
      return "X time";
    } else if (("O".equals(board[0][0]) && "O".equals(board[0][1]) && "O".equals(board[0][2])) || ("O".equals(board[1][0]) && "O".equals(board[1][1]) && "O".equals(board[1][2])) || ("O".equals(board[2][0]) && "O".equals(board[2][1]) && "O".equals(board[2][2])) || ("O".equals(board[0][0]) && "O".equals(board[1][0]) && "O".equals(board[2][0])) || ("O".equals(board[0][1]) && "O".equals(board[1][1]) && "O".equals(board[2][1])) || ("O".equals(board[0][2]) && "O".equals(board[1][2]) && "O".equals(board[2][2])) || ("O".equals(board[0][0]) && "O".equals(board[1][1]) && "O".equals(board[2][2])) || ("O".equals(board[2][0]) && "O".equals(board[1][1]) && "O".equals(board[0][2])))
	{
      return "O time";
    }
    return "none";
  }       
}