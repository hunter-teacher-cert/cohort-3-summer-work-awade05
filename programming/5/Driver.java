import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
  * Kate Maschmeyer
 * collaborators:
 * Alicia Wade
 * Marieke Thomas
 * Moo Joon Park
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

    	//declare a var of appropriate type to assign an instance of Time to
    	Time t;
    
    	//assign var the address of a newly-apportioned Time object
    	t = new Time();
    
      Time t2 = new Time(5, 27, 04);
      Time t3 = new Time(8, 40, 57);
      //System.out.println("t = " + t.toString());
      System.out.println("t = " + t);
      t.set(5,29,07);
      //System.out.println("After set: t = " + t.toString());
      System.out.println("After set: t = " + t);

      // System.out.println("t2 = " + t2.toString());
      // System.out.println("t3 = " + t3.toString());
      System.out.println("t2 = " + t2);
      System.out.println("t3 = " + t3);
      t2.add(t3);
      //System.out.println("t2 (after t3 added) = " + t2.toString()); // 14:8:1
      System.out.println("t2 (after t3 added) = " + t2); // 14:8:1
      Time t4 = new Time(8, 40, 57);
      System.out.println("t4 = " + t4.toString());
      System.out.println("t2 & t4 equal? " + t2.equals(t4)); // false
      System.out.println("t3 & t4 equal? " + t3.equals(t4)); // true
      System.out.println("Compare t2 to t4 " + t2.compareTo(t4)); // 1
      System.out.println("Compare t3 to t4 " + t3.compareTo(t4)); // 0
     System.out.println("Compare t4 to t2 " + t4.compareTo(t2)); // -1 
    
    
  }//end main()

}//end class