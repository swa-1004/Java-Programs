package Function;
import java.util.*;

public class Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Decimal number");
		int n=sc.nextInt();
		Binary obj=new Binary();
		obj.decToBin(n);
		
	}
	void decToBin(int n)
	{
		int bin=0;
		int i=0;
		int ld;
		while(n!=0)
		{
			ld=n%2;
			bin=bin+ld*(int)Math.pow(10,i);
			n=n/2;
			i++;
			
		}
		System.out.println("The binary equivqlent of given binary number is:"+bin);
	}

}
