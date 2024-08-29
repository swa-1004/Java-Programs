package Recurssion;
import java.util.*;

public class Occurance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key");
		int key=sc.nextInt();
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		find(arr,0,key);
		

	}
	public static void find(int arr[],int j,int key)
	{
		if(j==arr.length)
		{
			return;
			
		}
		if(arr[j]==key)
		{
			System.out.print(j+" ");
		}
		find(arr,++j,key);
	}

}
