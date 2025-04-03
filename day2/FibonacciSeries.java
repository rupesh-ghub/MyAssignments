package week1.day2;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int prev=0,current=1,next=0,num;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num = Integer.parseInt(number.nextLine());
		System.out.println("The Fibonacci Series for the given number is: ");
		
		for(int i=0; i<num; i++)
		{
			next=next+prev;
			System.out.print(" " +next);
			prev=current;
			current=next;					
			
		}
		
	}

}
