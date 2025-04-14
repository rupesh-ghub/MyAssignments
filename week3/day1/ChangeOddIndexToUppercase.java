package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char [] word = test.toCharArray();
		for (int i=0; i<word.length; i++)
		{
			if(i % 2 !=0)
			{
				word[i] = Character.toUpperCase(word[i]);
			}
			System.out.print(word[i]);
		}

	}

}
