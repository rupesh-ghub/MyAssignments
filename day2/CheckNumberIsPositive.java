package week1.day2;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		int version;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a Number:");
		version = Integer.parseInt(number.nextLine());
		
		if (version >= 0)
		{
			System.out.println("The given number is Positive");
		}
		else
			System.out.println("The given number is Negative");

	}

}
