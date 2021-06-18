package week1.day2;

public class ChangeOddIndexToUpperCase {
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	public static void main(String[] args) {
		
		 String test = "changeme";
	        String output = "";
	        for (int i = 0; i < test.length(); i++) {
	            if(i%2 == 0)
	            {
	                output += Character.toLowerCase(test.toCharArray()[i]);
	            }else
	            {
	                output += Character.toUpperCase(test.toCharArray()[i]);
	            }
	        }

	        System.out.println("Newly generated string is as follow: "+ output);
	    }

	}

