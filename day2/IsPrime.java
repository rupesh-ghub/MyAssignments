package week1.day2;
import java.util.Scanner;


public class IsPrime {

	public static void main(String[] args) {
		int num=0;
		boolean isPrime = true;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num = Integer.parseInt(number.nextLine());
		for (int i=2; i<num; i++)
		{
			if (num % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if (isPrime)
		{
			System.out.println("The number is Prime");
		}
		else
			System.out.println("The number is not Prime");
		
	}

}
