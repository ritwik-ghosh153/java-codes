
import java.util.Scanner;
class p3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int flag=0;
			int n=sc.nextInt();
			int s=sc.nextInt();
			int a[]=new int[n];
			for(int x=0;x<n;x++)
				a[x]=sc.nextInt();
			for(int j=0;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((a[j]+a[k])==s)
					{
						System.out.print("AVAILABLE "+a[j]+" "+a[k]+"\n");
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					break;
				}
			}
			if(flag==0)
				System.out.println("NOT AVAILABLE");
		}
	}
}
