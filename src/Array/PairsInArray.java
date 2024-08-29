package Array;

import java.util.Scanner;

public class PairsInArray {

	public static void main(String[] args) {
		
		int tp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Pairs in array are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				System.out.print("("+arr[i]+","+arr[j]+")\t");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total Pairs:"+tp);

	}

}
