package Recurssion;
import java.util.*;

public class Length {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		length(str,0);
		//System.out.println(str.substring(0,3));
		
		

	}
	public static void length(String str,int i)
	{
		int a=str.length();
		if(i==a)
		{
			System.out.println(i);
			return;
		}
		length(str,++i);
		
	}

}
