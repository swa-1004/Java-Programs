package Array;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		
	   int sum=0;
	   int maxsum=0,minsum=999;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Subarray of the given array are....");
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i;j<arr.length;j++)
			{
				sum=0;
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
					sum=sum+arr[k];
				}
				if(sum>0||sum<0)
				{
				System.out.print("  Sum ="+sum);
				}
				if(sum>maxsum)
				{
					maxsum=sum;
				}
				if(sum<minsum)
				{
					minsum=sum;
				}
				System.out.println();
			
				
			}
			System.out.println();
			
		}
		System.out.println("The maximum sum is:"+maxsum);
		System.out.println("The minimum sum is:"+minsum);

	}
	

}
