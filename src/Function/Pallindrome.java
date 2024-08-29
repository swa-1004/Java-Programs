package Function;
import java.util.*;

public class Pallindrome {

	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		pall(n);
		
	}
	static void pall(int n)
	{
		int pallindrome=n;
		int rev=0;
		while(n!=0)
		{   int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(pallindrome==rev)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Notpallindrome");
		}
		
	}
}
