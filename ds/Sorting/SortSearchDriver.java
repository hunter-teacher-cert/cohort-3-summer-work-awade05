import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);

	i = ss.findSmallestIndex(3);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
	
	// Uncomment these to test part 3
  System.out.println("Testing Sort: ");
	System.out.println(ss);
	ss.sort();
  System.out.println(ss);
  System.out.println("Testing linearSearch: ");
  System.out.println(ss);
  //System.out.println(ss.linearSearch(12));
  System.out.println(ss.linearSearch(10));
  System.out.println("");
   //binary   
  System.out.println("Testing binarySearch: ");
  System.out.println(ss);
  System.out.println(ss.binarySearch(12));  

  //Recursive Search
  System.out.println(i + " is at position: " + ss.binarySearchRecursive(i,0,19));
  System.out.println("");
	


	      

    }
}