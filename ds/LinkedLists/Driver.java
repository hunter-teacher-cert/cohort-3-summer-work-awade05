import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Hello");
    l.add("there");
    l.add("how");
    l.add("are");
    l.add("you");
    //System.out.println(l);
    // System.out.println(l.get(2)); 
    // System.out.println(l.get(3)); 
    // System.out.println(l.size());
    System.out.println("List that test add: ");
    l.add(1, "yes");//add
    System.out.println("List that test out of bounds: ");
    l.add(-1, "no");//out of bounds
    System.out.println(l);
    System.out.println("Lists that test remove: ");
    l.remove(3);
    System.out.println(l);
     System.out.println("Test for 0 index: ");
    l.add(5, "yes");//add
    System.out.println(l);
   
    
  }
}