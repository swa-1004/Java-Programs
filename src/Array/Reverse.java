package Array;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements before reversing");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\nElements after reversing");
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		

	}

}
