import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life Team AreWeSentientYet?
 * Alicia Wade
 * worked with team, but did my own version:  Yenmin Young, Jerusha Theobald 
 * 
 */

/**
   The Rules of Life:
   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.
   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.
   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.
   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{
  //copied from Array Practice
  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
  char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]='-';
      }
    }
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
  //copied from my code with Array practice
  //initialize to get the lenghth of rows and columns
    int rows = board.length;
    int cols = board[0].length;
  //loops through the rows and columns to create the board
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println("");  
  }
  }

  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
  board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    int rows = board.length;
    int cols = board[0].length;
    
    //varibale to count neighbors
    int neighborCount = 0;
    //loop to check through the board 
  
     for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
    //excludes the square itself and checks the area around
        if((r -1 <= i && j <= r + 1) &&
           (c-1 <= j && j <= c+1) &&
           (!(i == r && j == c))) {
    //counts the # of .s to play the game
            if(board[i][j] == '.'){
            neighborCount++;
            }
          }
      } 
     }
     return neighborCount;
    }
  


  /**
     precond: given a board and a cell 
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    //
    char nextGen = board[r][c];
    //check count for neighbours
    int count = countNeighbours(board,r,c);
    
    //cell is alive
    if (nextGen == '.'){ 
          //lonely and overcrowded
      if (count < 2 || count >3){
        nextGen = '0';
      } 
     //dead cell
    } else {
    //dead but has three alive neighbors
      if (count == 3){  
          nextGen = '.';
        }
      }
 
    return nextGen;
      
    }
  


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    int rows = board.length;
    int cols = board[0].length;

    //create the new board 
    char[][] newGameBoard = new char[rows][cols];

    //loop to traverse the board
    for(int i =0; i < rows; i++){
      for(int j =0; j < cols; j++){
        newGameBoard [i][j] = getNextGenCell(board, i, j);
      }
    }
    return newGameBoard;
  }


  public static void main( String[] args )
  {
      char[][] board;
      board = createNewBoard(5,5);
      setCell(board, 0, 0, '.');
      setCell(board, 0, 1, '.');
      setCell(board, 1, 0, '.');
      System.out.println("Gen X:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
   
    //breathe life into some cells:
   
    // TASK:
    // Once your initial version is running,
    // try out different starting configurations of living cells...
    // (Feel free to comment out the above three lines.)

    board = generateNextBoard(board);
    System.out.println("Gen X+1:");
    printBoard(board);
    System.out.println("--------------------------\n\n");
  }//end main()

}//end class