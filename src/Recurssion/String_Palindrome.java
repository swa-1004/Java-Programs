package Recurssion;
import java.util.*;

public class String_Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
	    
	System.out.println(	isPalindrome(str,0,str.length()-1));

}
	public static boolean isPalindrome(String str,int i,int n)
	{
		if(i>=n/2)
		{
			return true;
		}
		if(str.charAt(i)==(str.charAt(n-i-1)))
		{
	         isPalindrome(str,i+1,n);
	         return true;
			
		}
		else
		{
			return false;
		}
	}
}
