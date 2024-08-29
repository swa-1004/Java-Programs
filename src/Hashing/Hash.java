package Hashing;
import java.util.*;


public class Hash {

	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer> mp =new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			int key=arr[i];
			int freq=0;
			
			if(mp.containsKey(key))
			{
				freq=mp.get(key);
			}
			freq++;
			mp.put(key,freq);
			
			
		}
		
		System.out.println("Enter the number to find it's frequency");
		int num=sc.nextInt();
		System.out.println(num+"->"+mp.get(num));
	

	}

}
