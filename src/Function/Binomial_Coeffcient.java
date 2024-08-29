package Function;
import java.util.*;

public class Binomial_Coeffcient {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//Binomial coefficient=n!/r1(n-r)!
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of r");
		int r=sc.nextInt();
		int result=binCoeff(n,r);
		System.out.println("The Binomial Coefficient is:"+result);

	}
static	int binCoeff(int n,int r)
	{
		int a=fact(n);
		int b=fact(r);
		int c=fact(n-r);
		return a/(b*c);
		
	}
static int fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}

}
