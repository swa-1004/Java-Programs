package Recurssion;

import java.util.Scanner;

public class Last_Occurrance {
	
	
	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the Key Element");
		int key=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=last(arr,arr.length-1,key);
		if(a!=0)
		{
			System.out.println("Key element is at index ="+a);
		}
		else
		{
			System.out.println("Element not found");
		}

	}
	public static int last(int arr[],int i,int key)
	{
		
	
		if(i==0)
		{
			return 0;
		}
		else if(arr[i]==key)
		{
			return i;
		}
		
		else
		{
			return last(arr,i-1,key);
		}
		
	}
	

}
