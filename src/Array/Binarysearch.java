package Array;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		
	    int key,mid,j,start=0,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key element");
		key=sc.nextInt();
		start=0;
		end=n-1;
		while(start<=end)
		{
			mid=(start+end)/2;
			if(key==arr[mid])
			{
				System.out.println("Element found");
				System.out.println("It's is at "+mid+" index");
				break;
			}
			else if(key>mid)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		if(start>end)
		{
			System.out.println("Not Found");
		}
		

	}

}
