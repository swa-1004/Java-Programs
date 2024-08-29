package Recurssion;
import java.util.*;

public class Power {

	public static void main(String[] args) {
		int x,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value x and n");
		x=sc.nextInt();
		n=sc.nextInt();
		System.out.println(power(x,n));
		

	}
	public static int power(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return x*power(x,n-1);
		}
	}

}
