package Strings;

public class Compare {

	public static void main(String[] args) {
		
		String a="apple";
		String b="apple";
		String c=new String("apple");
		if(a==b)       //a and b points to the same string
		{
			System.out.println("Strings are equal");
			
		}
		else
		{
			System.out.println("Strings are not equal");
			
		}
		if(a==c)  // c creates a new string
		{
			System.out.println("Strings are equal");
			
		}
		else
		{
			System.out.println("Strings are not equal");
			
		}
		if(a.compareTo(c)==0)// compareTo function compares the content which is stored in the string
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
			
		}
			
		

	}

}
