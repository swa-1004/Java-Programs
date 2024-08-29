//Prefix Method
package Array;

import java.util.Scanner;

public class MaxSumSubArray {

	public static void main(String[] args) {
	
		int n,sum=0;
		int maxsum=Integer.MIN_VALUE;
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int prefix[]=new int[arr.length];
		prefix[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			prefix[i]=prefix[i-1]+arr[i];
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
				System.out.println(sum);
				if(maxsum<sum)
				{
					maxsum=sum;
					
				}
			}
			
			
			
		}
		System.out.println("MaxSum="+maxsum);
		
	}

}
