//Khadane's Algorithm
//Time complexity=O(n)
//Khadane's Algorithm  is used to find maximumm sum  subarray
package Array;
import java.util.*;

public class MaxSusmArray3 {

	public static void main(String[] args) {
		int min=Integer.MIN_VALUE;
		int currentsum=0;
		int maxsum=Integer.MIN_VALUE;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			
			
			currentsum=currentsum+arr[i];
			if(currentsum<0)
			{
				currentsum=0;
			}
			maxsum=Math.max(currentsum,maxsum);
			
		}
		System.out.println("Maximum sum="+maxsum);
		

	}

}
