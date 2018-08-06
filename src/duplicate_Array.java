import java.util.Scanner;

public class duplicate_Array {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int i,j,k=0;
		int x[]= new int[6];
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the values into the array");
		for(i=0;i<5;i++)
		{
			x[i]= a.nextInt();
		}
		for (i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i!=j&&x[i]==x[j])
				{
					k++;
				}
			}
		}
		if(k>0)
		{
			System.out.println("The array has duplicate values");
		}
		else
		{
			System.out.println("The array doesnt have any duplicate values");
		}
	}
	
}
