import java.util.Arrays;
import java.util.Scanner;
public class maxmin 
{
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		int i;
		System.out.println("Enter the number of values in your array");
		int n = s.nextInt();
		int[] a= new int[n];
		System.out.println("Enter the values into the array");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
	
	
		System.out.println("maximum value is "+a[n-1]+" Minimum value is "+ a[0]);
		
	}

}
