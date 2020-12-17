/*Matching the brackets '( )' --->1*/
import java.util.*; 
import java.io.*;

class Main {

  public static int BracketMatcher(String str) {
    // code goes here  
    
		int Count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				Count = Count + 1;
			} else if (str.charAt(i) == ')') {
				Count = Count - 1;
			}
			if (Count < 0) {
				return 0;
			}
    }
		if (Count == 0) {
			return 1;
    }
		return 0;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(BracketMatcher(s.nextLine())); 
  }

}