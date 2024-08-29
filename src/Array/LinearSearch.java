package Array;
import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the key element you want to ssearch");
		int key=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				flag=true;
			}
		}
		if(flag==true)
		{
			System.out.println("Element present ");
		}
		else
		{
			System.out.println("Element Not present ");
			
		}
		

	}

}
