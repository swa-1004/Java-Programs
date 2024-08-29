package Function;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		Prime obj=new Prime();
		System.out.println(obj.primeNo(n));
		

	}
	boolean primeNo(int n)
	{
		boolean isPrime=true;
		if(n<=0)
		{
			System.out.println("invalid number");
			return false;
	    }
		else if(n==2)
		{
			return true;
		}
		else
		{
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		return true;
	}

}
}
