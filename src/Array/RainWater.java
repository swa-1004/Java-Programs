//Trapping rain water
//It is used to calculate the trapped rain water between the blocks

package Array;
import java.util.*;

public class RainWater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the number of blocks");
		int n=sc.nextInt();
		System.out.println("Enter the heights of the blocks");
		int height[]=new int[n];
		for(int i=0;i<n;i++)
		{
			height[i]=sc.nextInt();
		}
		System.out.println("Trapped Water="+trappedRainWater(height));

	}
	static int trappedRainWater(int height[])
	{
		//Calculate left maximum height
		int leftmax[]=new int[height.length];
		leftmax[0]=height[0];
		for(int i=1;i<height.length;i++)
		{
			
			leftmax[i]=Math.max(leftmax[i-1],height[i]);
		}
		

		//Calculate right maximum height
		int rightmax[]=new int[height.length];
		rightmax[height.length-1]=height[height.length-1];
		for(int i=height.length-2;i>=0;i--)
		{
			
			rightmax[i]=Math.max(rightmax[i+1],height[i]);
		}
		
		//Calculate the trapped rain water
		
		int trappedwater=0;
		for(int i=0;i<height.length;i++)
		{
			int waterlevel=Math.min(leftmax[i],rightmax[i]);
			trappedwater+=waterlevel-height[i];
			
		}
		return trappedwater;
	}

}
