package Strings;
import java.util.*;

public class Route {

	public static void main(String[] args) {
		
		System.out.println("Enter the Path");
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println(path(str));

	}
	public static double path(String str)
	{
		int x=0,y=0,X2=0,Y2=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='w'||str.charAt(i)=='W') {
				x-=1;
			}
			else if(str.charAt(i)=='e'||str.charAt(i)=='E')
			{
				x+=1;
			}
			else if(str.charAt(i)=='n'||str.charAt(i)=='N') {
				y+=1;
			}
			else
			{
				y=y-1;
			}
			X2=x*x;
		    Y2=y*y;
			
			
		}
		return Math.sqrt(X2+Y2);
		
		
	}

}
