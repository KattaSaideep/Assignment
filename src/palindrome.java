import java.util.Scanner;
public class palindrome
{
	public static void main(String args[])
	{
		String original, reverse="";
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your string");
		original=s.nextLine();
		int length= original.length();
		for(int i=length-1;i>0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}

}
