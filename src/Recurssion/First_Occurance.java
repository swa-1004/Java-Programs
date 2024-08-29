package Recurssion;
import java.util.*;

public class First_Occurance {

	public static void main(String[] args) {
		int j=0;
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
		int a=first(arr,0,key);
		if(a!=0)
		{
			System.out.println("Key element is at index ="+a);
			
		}
		else
		{
			System.out.println("Element not found");
		}
		
		
		
		

	}
	public static int first(int arr[],int j,int key )
	{
		if(j==arr.length)
		{
			return 0;
		}
		if(arr[j]==key)
		{
			
			return j;
		}
		else
		{
			return first(arr,j+1,key);
		}
		
	}

}
