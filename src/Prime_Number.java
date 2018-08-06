import java.util.Scanner;

public class Prime_Number {
	public static void main(String args[])
	{
		int i,n,x=0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number");
		n=a.nextInt();
		for (i=1;i<n;i++)
		{
			if(n%i==0)
			{
				x++;
			}
			
		}
		if(x<=2)
		{
			System.out.println("The given number is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
	}

}
