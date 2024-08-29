package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Monotonic {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<>();
		System.out.println("Enter the elements of list");
		Scanner sc=new Scanner(System.in);
		al.add(sc.nextInt());
		monotonic_Array(al);
		
		}
	public static void monotonic_Array (ArrayList<Integer> al)
	{
	 boolean a=true;
		
		for(int i=0;i<al.size();i++)
		{
			
				if(al.get(i)<=al.get(i+1))
				{
					a=true;
					
				}
				else
				{
					a=false;
					System.out.println(a);
					break;
				}
		}
			if(a==true)
			{
				System.out.println(a);
			}
		}
		
	}
	


