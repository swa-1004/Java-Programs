package Recurssion;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println(n+" Fibonacci number is = "+fib(n));
		
		
	}
	public static int fib(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else if(n==0)
		{
			return 0;
		}
		else
		{
			return fib(n-1)+fib(n-2);
		}
	}

}
