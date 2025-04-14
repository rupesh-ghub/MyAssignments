package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int [] ranks = {5,2,7,2,5,7,9,3};
		int length = ranks.length;
		Arrays.sort(ranks);
		System.out.println("The Duplicates are: ");
		for (int i=0; i<length-1; i++)
		{			
			if (ranks[i] == ranks[i+1])
			{
			System.out.print(" " +ranks[i]);
			}
			else
			{
				continue;
			}
		}
	}

}
