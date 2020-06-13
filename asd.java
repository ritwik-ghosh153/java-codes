import java.util.*;
class asd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>=38)
            {
                if((a[i]%5)>=3)
                    a[i]+=5-a[i]%5;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
