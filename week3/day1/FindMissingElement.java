package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr1[] = {1,4,3,2,8,6,7}, j=1;
		Arrays.sort(arr1);
		System.out.println("The missing number is:");
		for (int i=0; i<arr1.length-1; i++)
		{
			if (arr1[i]==j)
			{
				j=j+1;
				continue;
			}
			else
			{
				System.out.print(j);
				j++;
				i--;
			}
				
		}

	}

}
