import java.util.Scanner;

public class Pyramid {
	public static void main(String args[])
	{
		int i,n;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the level of the pyramid");
		n=a.nextInt();
		int x=1;
		for(i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=x;j++)
			{
				System.out.print(x+" ");
			}
			System.out.println();
			x++;
		}
	}

}
