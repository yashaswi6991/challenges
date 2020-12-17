/*program for printing the longest word from the sentence given */


String LongestWord(String input) { 
    //spliting the words by empty space
    String[] words = input.split(" ");
	
	//creating an empty string
		String max = "";
			
		for( String word : words ){
		//creating an empty string 
	      String clear = "";
		  //running the loop 
	      for( int i = 0; i < word.length(); i++ ){
	        if( Character.isLetter(word.charAt(i)) || Character.isDigit(word.charAt(i)) ){
			//concatenating each character at index 'i' with empty string
	          clear = clear + word.charAt(i);
	        }
	      }
	      //checking the condition
	      if( clear.length() > max.length() ){
	        max = clear;		
	      }
		}
			
		return max;
  } 
   public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}

