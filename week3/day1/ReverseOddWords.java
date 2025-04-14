package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
	String test = "I am a software tester";
	String delimiter = " ";
	String words [] = test.split(delimiter);
	for (int i=0; i<words.length; i++)
	{
		if (i % 2 !=0)
		{
			char [] revstr = words[i].toCharArray();
			for(int j=revstr.length-1; j>=0; j--)
			{
				System.out.print(revstr[j]);
			}
			System.out.print(" ");
		}
		else
		{
			System.out.print(words[i] +" ");
		}
	}

 }

}
