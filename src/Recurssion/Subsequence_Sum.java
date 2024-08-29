package Recurssion;
import java.util.*;

public class Subsequence_Sum {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(1);
		ArrayList<Integer>  list =new ArrayList<Integer>();
		int key=2;
		sequence(list1,0,2,list,0,2);

	}
	public static void sequence (ArrayList<Integer> list1,int i,int n,ArrayList<Integer> list,int sum,int key)
	{
		if(i>n)
		{
			if(sum==key)
			{
				System.out.println(list);
			}
			return;
		}
		list.add(list1.get(i));
		sum=sum+list1.get(i)
				;
		sequence(list1,i+1,n,list,sum,key);
		sum=sum-list1.get(i);
		list.remove(list1.get(i));
		
		sequence(list1,i+1,n,list,sum,key);
			
	}

}
