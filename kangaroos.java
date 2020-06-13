import java.util.*;
class kangaroos
{
	 int x1, x2,  v1,  v2;
	 void kangaroo()
	{
		if ((x1>x2 && v1>=v2)||(x2>x1 && v2>=v1)||(x1==x2 && v1!=v2))
			System.out.print("NO");
		else if(x1>x2)
			{
				int s1=x1,s2=x2;
				while(s2<s1){
					s1+=v1;
					s2+=v2;
					if(s1==s2){
						System.out.print("YES");
						System.exit(0);
					}
				}
				System.out.println("NO");
			}
		else if(x2>x1)
		{
			int s1=x1,s2=x2;
			while(s1<s2){
				s1+=v1;
				s2+=v2;
				if(s1==s2){
					System.out.print("YES");
					System.exit(0);
				}
			}
			System.out.println("NO");
		}
		else if(x1==x2)
		{
			if(x1==x2 && v1==v2)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	public static void main(String args[])
	{
		kangaroos k=new kangaroos();
		Scanner sc=new Scanner(System.in);
		k.x1=sc.nextInt();
		k.v1=sc.nextInt();
		k.x2=sc.nextInt();
		k.v2=sc.nextInt();
		k.kangaroo();
		
	}
}
