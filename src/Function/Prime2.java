package Function;
import java.util.*;

public class Prime2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		Prime2 obj=new Prime2();
		obj.prime(n);
		

	}
	void prime(int n)
	{
		for(int i=2;i<=n;i++)
			
		{
			boolean a=isprime(i);
			if(a==true)
			{
				System.out.println(i);
			}
		}
	}
 static	boolean isprime(int i)
 {
	if( i==2)
	{
		return true;
	}
	for(int j=2;j<i/2;j++)
	{
		if(i%j==0)
		{
			return false;
		}
		
	}
	return true;
 }

}
