//Find the largest string
//It works Lexicographically

package Strings;

public class LargestString {

	public static void main(String[] args) {
		
		String str[]= {"apple","banana","mango","grapes","Mango"};
		String largest=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(largest.compareTo(str[i])<0)
			{
				largest=str[i];
			}
		}
		System.out.println("The largest string is : "+largest);
		
		

	}

}
