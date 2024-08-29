package Hashing;
import java.util.Scanner;

public class Hash1 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number to calculate it's count");
		int num=sc.nextInt();
		
		int hash[]=new int[arr.length];
		
		//pre-storing
		
		for(int i=0;i<hash.length;i++)
		{
			hash[arr[i]]+=1;
		}
		
		System.out.println(num+" = "+hash[num]);
		
		
	}

}
