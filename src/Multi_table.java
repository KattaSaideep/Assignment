import java.util.Scanner;

public class Multi_table {
	public static void main(String args[])
	{
		int i,n,x;
		System.out.println("Enter the number for the mukltiplication table");
		Scanner a= new Scanner(System.in);
		n = a.nextInt();
		for(i=1;i<=10;i++)//hhvgjvh
		{
			x=n*i;
			System.out.println(n+"*"+i+"="+x);
		}
	}

}
