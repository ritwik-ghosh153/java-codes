import java.util.Scanner;
class p1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int flag=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			int c=sc.nextInt();
			int d=c;
			a[0]=c;
			if(n>1)
			{
				for(int j=1;j<n;j++)
				{
					a[j]=sc.nextInt();
					if(c<a[j])
					{
						c=a[j];
						d=c;
					}
					else if(d<a[j])
					{
						c=a[j];
						d=c;
					}
					else if(c>a[j] && flag<=1)
					{
						flag++;
						d=a[j];
						continue;
					}
					else if(c>a[j] && flag>1)
					{
						System.out.println("FALSE");
						break;
					}
				}
				if(flag<=1)
					System.out.println("TRUE");
				else
					System.out.println("FALSE");
			}
		}
	}
}
