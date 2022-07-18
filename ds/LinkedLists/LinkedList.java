import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
   head = new Node (value, head);
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    int count = 0;
    Node walker = head;
    while(count != index){
        walker = walker.getNext();
        count++;
    if (walker == null){
      return "";
      }
    }
      return walker.getData();
    }
    


  /**
  Return a string representation of the list
  */
  public String toString(){
     String s = "";
      Node walker = head;
      while (walker != null){
        s = s + walker.getData() + "->";
        walker = walker.getNext();
    }
    
    return s;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    //counter start at 0 
    int count = 0;
    //walker points to the head
    Node walker = this.head;
      while (walker != null) {
      count++;
      walker = walker.getNext();
}
    return count;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){
    Node n = new Node (value);

    //index outbounds
    if(index < 0 || index > size()){
      System.out.println("Out of Bounds");
    }
      //if index 0 use add method
    else if(index ==0){
      add(value);
    }
    else {
      //anything in between
      Node walker = head;
      for(int i = 0; i < index-1; i++){
        walker = walker.getNext();
      }
      n.setNext(walker.getNext());
      walker.setNext(n);
    }
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    Node walker = head;
    int index = 0;
    while(walker != null){
      if (walker.getData() == value){
        return index;
      }
      walker = walker.getNext();
      index++;
    }
    return -1;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    String[] arry2 = new String[size()];
    Node walker = head;
    int index = 0;
    while (walker != null){
      arry2[index] = walker.getData();
      walker = walker.getNext();
      index++;
    }
    return arry2;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
    Node walker = head;
    for (int i =0; i < index-1; i++){
      walker = walker.getNext();
    }
    walker.setNext(walker.getNext().getNext());
  }
}