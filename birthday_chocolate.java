//Ritwik's cod
import java.util.Scanner;
class birthday_chocolate
{
	public static void main(String args[])
	{
		int s;//d
		int l;//m
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		s=sc.nextInt();
		l=sc.nextInt();
		int count=0;
		int sum;
		for(int i=0;i<n-l+1;i++)
		{
			sum=0;
			for(int j=i;j<i+l;j++)
			{
				sum+=arr[j];
			}
			if(sum==s)
				count++;
		}
		System.out.print(count);
	}
}
