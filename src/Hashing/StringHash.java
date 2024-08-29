package Hashing;
import java.util.Scanner;

public class StringHash {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		char[] arr=new char[26];
		
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)-'a']+=1;
		}
		
		
		
		
		

	}

}
