/*program 2 : calling a function recursively */

class Main {
/*function which takes integer as parameter and returns int */
  public static int FirstFactorial(int num) {
    // code goes here
	
	/*if num is less than 1 return 1 
	else return the factorial of the number*/
	
      if (num <= 1)
      {
      return 1;
      }
   else
   {

      return num * FirstFactorial(num - 1);
   }

  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}