package ticTacToeProject;

import java.util.Scanner;

class Main 
{
  public static void main(String args[])
  {
    Scanner input = new Scanner (System.in);
    String b[][] = { 
		{ "1", "2", "3"} , { "4", "5", "6"} , { "7", "8", "9"}
					};
   
    String playerOne = null;
    boolean turnIdentifier = false;
    boolean gameOver = false;
    boolean gameTie = false;
    int boardCap = 0;
	
    String spaceModifier = "X";
    System.out.println("Player One, would you like to X or O?");
    String select = input.nextLine();
    System.out.println(" ");
    
	if (select.equals("x") || select.equals("X")) 
	{
      System.out.println("Player One: X");
      System.out.println("Player Two: O");

      playerOne = "X";
    } 

	else if(select.equals("o") || select.equals("O"))
	{
      System.out.println("Player One : O");
      System.out.println("Player Two : X"); 
      playerOne = "O";     
    } 

	else 
	{
      System.out.println("Player One : X");
      System.out.println("Player Two : O");
      playerOne = "X";
    }
    int turnTime = (int)(Math.random() * 10 + 1);
    System.out.println(" ");
    if (turnTime <= 4){
      System.out.println("X will go first.");
      turnIdentifier = true;
    } 
	
	else 
	{
      System.out.println("O will go first.");
      turnIdentifier = false;
    }
    System.out.println(" ");
    while (gameOver == false && gameTie == false)
	{
      display.displayBoard(b);
      System.out.println(" ");
      if (turnIdentifier){
        System.out.println("its X's turn");
        spaceModifier = "X";
      } 
	  if (turnIdentifier == false)
	  {
        System.out.println("its O's turn");
        spaceModifier = "O";
      }
	  
      String space = input.nextLine();
      if (space.equals("X") == false && space.equals("O") == false)
	  {
        System.out.println(" ");
        
		for (int i = 0; i < 3; i++)
		{
          for (int j = 0; j < 3; j++)
		  {
            if (space.equals(b[i][j]))
			{
              b[i][j] = spaceModifier;
              turnIdentifier = !turnIdentifier;
              boardCap++;
            }
          }
        }
      }
      if (win.checkWinner(b).equals("X time") || win.checkWinner(b).equals("O time"))
	  {
        gameOver = true;
      } 
	  
	  else if (boardCap == 9)
	  {
        gameTie = true;
      } 
	  
	  else if ((win.checkWinner(b).equals("X time") || win.checkWinner(b).equals("O time")) && boardCap == 9)
	  {
        gameOver = true;
      } 
	  
	  else 
	  {
        gameOver = false;
        gameTie = false;
      }
    }
    display.displayBoard(b);
    System.out.println(" ");
    
	if (boardCap == 9 && win.checkWinner(b).equals("none"))
	{
      System.out.println("Game Over! \nTIE!");
    }
    if (win.checkWinner(b).equals("X time"))
	{
      System.out.println("Game over!");
      if (playerOne.equals("X"))
	  {
        System.out.println("Player One Wins!");
      } 
	  
	  else if (playerOne.equals("O"))
	  {
        System.out.println("Player Two Wins!");
      } 
	  
	  else 
	  {
        System.out.println(" ");
      }
    }
    if (win.checkWinner(b).equals("O time"))
	{
      System.out.println("Game over!");
      if (playerOne.equals("O"))
	  {
        System.out.println("Player One Wins!");
      } 
	  
	  else if (playerOne.equals("X"))
	  {
        System.out.println("Player Two Wins!");
      } 
	  else 
	  {
        System.out.println(" ");
      }
    }
    input.close();
  }
}
