/*Reverse of a string program */
import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
    /*Finding the length to run the loop and printing the string */
    for(int i = str.length()-1; i < str.length(); i--)
    {
     System.out.print(str.charAt(i)); 
    }
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}

