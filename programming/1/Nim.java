/* 
  GOAL: Be the player to remove the last stone.
  RULES:
  - bag contains 12 stones initially
  - a move consists of removing 1-3 stones from the bag
  CODE:
  - turn starts with prompting user for num of stones to remove
  - tell user how many AI removed (random 1-3)
  - continue until there is a winner
*/

import java.io.*;
import java.util.*;

public class Nim {
  public static void main(String[] args){
    int stones = 12;
    //int stonesTaken;
    Scanner input = new Scanner(System.in);
 //Game starts
    System.out.println("How many stones do you want to take? (1, 2 or 3)");
int turn = 1;
    
    // Round begins reading # of stones in the bag
    printBag(stones);

    while(stones > 0){
      System.out.printf("Turn %d\n", turn);
      
      // Player takes their turn first
      stones = playersTurn(stones);
      printBag(stones);
      System.out.println();

      if (stones == 0){
        System.out.println("Player wins!");
        // Add break to end the while loop before the computer plays
        break;
      }
      
      // Computer takes their turn second
      stones = computersTurn(stones);
      printBag(stones);
      System.out.println();

      if (stones == 0){
        System.out.println("Computer wins!");
      }

      turn++;
    }
    
    }

//player's turn
  private static int playersTurn (int stones){
    Scanner input = new Scanner(System.in);
  //initializes the starting stones
    int stonesTaken =0;
    System.out.println("How many stones would you like to remove? (1-3)");
    while (stonesTaken > 3 || stonesTaken < 1 || (stones - stonesTaken < 0)){

    stonesTaken = input.nextInt();
    input.nextLine();
    if (stonesTaken > 3 || stonesTaken < 1) {
    System.out.println("You can only remove 1-3 stones.");
      }
  // Check if the player took more stones than are left in the bag
    if (stones - stonesTaken < 0){
    System.out.println("There aren't enough stones left! Try again.");
      }
    }
  // calculates new bag based on user input
    return stones - stonesTaken;
}

//computer's turn
  private static int computersTurn (int stones)
    {
//intinalizes starting stones
    int stonesTaken =0;
    Random generator = new Random();
    if (stones <= 3){
    stonesTaken = stones;
    } else {
      // If not, the computer picks a random number
    stonesTaken = 1 + generator.nextInt(3);
    }
//prints computer choice
    System.out.println("The computer chooses " + stones);
    return stones - stonesTaken;
    }
  
  // number of stones in the bag 
  public static void printBag(int stones){
    System.out.println("There "
      + ((stones == 1) ? "is " : "are ")
      + stones 
      +" in the bag.\n");
  }
  
}
    
  

