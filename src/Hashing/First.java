//Counting Array Elements using for loop

package Hashing;
import java.util.Scanner;

public class First {
	
	
	
	public void count(int n ,int [] arr)
	{
	    int total=0;
	    for(int x:arr)
	    {
	    	if(n==x)
	    	{
	    		total=total+1;
	    	}
	    }
	    System.out.println(n+" = "+total);
	}

	public static void main(String[] args) {
		
		int arr[]={10,2,10,5,3};
		
		
		First obj =new First();
		obj.count(10,arr);
		obj.count(1, arr);
		
		

	}

}
