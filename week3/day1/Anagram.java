package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()!= text2.length())
			{
				System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			}
		else 
		{
			char chararray1[] = text1.toCharArray();
			char chararray2[] = text2.toCharArray();
			Arrays.sort(chararray1);
			Arrays.sort(chararray2);
			if(Arrays.equals(chararray1, chararray2))
			{
				System.out.println("The given strings are Anagram");
			}
			else
			{
				System.out.println("The given strings are not an Anagram");
			}
		}
	}
}
