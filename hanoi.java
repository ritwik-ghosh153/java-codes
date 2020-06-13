import java.util.*;
class hanoi
{
	static int s=0;
	void T(int n, char B, char A, char E)
	{
		if(n==1)
		{
			s++;
			System.out.println("Move "+B+" to "+E);
		}
		else
		{
			T(n-1,B,E,A);
			T(1,B,A,E);
			T(n-1,A,B,E);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of  disks");
		int n=sc.nextInt();
		hanoi ob=new hanoi();
		ob.T(n,'B','A','E');
		System.out.println("Number of terms="+s);
		
	}
}
