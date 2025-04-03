package week1.day2;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int input=0, output=0, rem=0;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a Number:");
		input = Integer.parseInt(number.nextLine());
		
		for (int i=input; i>0; i/=10)
		{
			output = output * 10 + i%10;			
			
		}
		if (input == output)
		{
			System.out.println("The given number is Palindrome");
		}
		else
			System.out.println("The given number is not Palindrome");
		
	}

}
