package Function;
import java.util.*;

public class BinToDec {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n=sc.nextInt();
		BinToDec obj=new BinToDec();
		obj.bToDec(n);
		
				
				
	}
	void bToDec(int a)
	{
	   int dec=0;
	   int rev=0;
	   int i=0;
	   while(a!=0)
	   {
		   rev=a%10;
		   dec=dec+rev*(int)Math.pow(2,i);
		   a=a/10;
		   i++;
	   }
	   System.out.println("The decimal equivalent of the given binary number is:"+dec);
	}

}
