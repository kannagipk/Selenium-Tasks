package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		String str = "welcome to chennai";
		
		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		// convert the string into char array
		char[] chararray = str.toCharArray();			
					//get the length of the array
		//int length = chararray.length;
						
					// traverse from 0 till the array length
		for(int i=0;i<str.length();i++) {
			if(chararray[i] == str.charAt(i)) {
				
				count++;    
			}
			
		}
		
		System.out.println("Total of charater"+" "+" "+ "is" +" " +count);
						
						// Check the char array has the particular char in it 
					
						// if is has increment the count
							 
						
						// print the count out of the loop

	}

}
