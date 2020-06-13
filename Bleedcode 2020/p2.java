import java.util.Scanner;
class p2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[][]=new int[n][m];
			for(int x=0;x<n;x++)
			{
				a[x][0]=sc.nextInt();
				int min=a[x][0];
				for(int y=1;y<m;y++)
				{
					a[x][y]=sc.nextInt();
					if(a[x][y]<min)
						min=a[x][y];
				}
				System.out.print(min+" ");
			}
		}
	}
}
