package week1.day2;
import java.util.Arrays;  

public class Anagram {
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		int txtlen1 = text1.length();
		int txtlen2 = text2.length();
		if(txtlen1==txtlen2) {
			char[] char1 = text1.toCharArray();
			char[] char2 = text2.toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			if (Arrays.equals(char1,char2)== true) {
				System.out.println("Given text is Anagram!");
			}else {
				System.out.println("Given is not a Anagram!");
			}
		}
	}

}
