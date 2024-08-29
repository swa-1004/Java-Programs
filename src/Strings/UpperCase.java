//For a given string convert First letter of each word to uppercase

package Strings;
import java.util.*;

public class UpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the String");
		str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
	    char ch=Character.toUpperCase(str.charAt(0));
	    sb.append(ch);
	    for(int i=1;i<str.length();i++)
	    {
	    	if(str.charAt(i)==' ' && i<str.length()-1)
	    	{
	    		sb.append(str.charAt(i));
	    		i++;
	    		sb.append(Character.toUpperCase(str.charAt(i)));
	    		
	    		
	    	}
	    	else
	    	{
	    		sb.append(str.charAt(i));
	    	}
	    }
	    System.out.println(sb.toString());
		


	}

}
