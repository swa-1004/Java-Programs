package Array;

public class SubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int arr[]= {1,-2,6,-1,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum=sum+arr[k];
					System.out.print(arr[k]+" ");
				}
				System.out.print(" Sum ="+sum);
				if(max<sum)
				{
					max=sum;
				}
				if(min>sum)
				{
					min=sum;
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Maximum value of subarray = "+max);
		System.out.println("Minimum value of subarray = "+min);

	}

}
