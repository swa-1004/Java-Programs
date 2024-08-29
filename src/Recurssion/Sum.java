package Recurssion;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		
		int arr []= {2,3,4,7};
	    ArrayList<ArrayList<Integer> >list =new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> ds=new ArrayList<>();
	    print_sum(list,ds,0,arr.length,7,arr);
	   for(int i=0;i<list.size();i++)
	   {
		   System.out.println(list.get(i));
	   }
		

	}
	public static void print_sum(ArrayList<ArrayList<Integer>> list,ArrayList<Integer> ds,int i,int n,int target,int [] arr)
	{
		if(i==arr.length)
		{
			if(target==0)
			{
				list.add(new ArrayList<> (ds));
			}
			return;
		}
		if(arr[i]<=target)
		{
			ds.add(arr[i]);
			print_sum(list,ds,i,n,target-arr[i],arr);
			ds.remove(ds.size()-1);
		}
		print_sum(list,ds,i+1,n,target,arr);
		
	}
}
