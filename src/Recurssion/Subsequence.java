package Recurssion;
import java.util.*;

public class Subsequence {

	public static void main(String[] args) {
		
		ArrayList<Integer>list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(1);
		ArrayList<Integer> list =new ArrayList<Integer>();
		sequence(list1,0,2,list);
		}
	public static void sequence(ArrayList<Integer> list1,int i,int n,ArrayList<Integer> list)
	{
		if(i>n)
		{
		
		    System.out.println(list);
			return;
		
		}
		list.add(list1.get(i));
		
		sequence(list1,i+1,n,list);
		
		list.remove(list1.get(i));
		sequence(list1,i+1,n,list);
		
		
	}

}
