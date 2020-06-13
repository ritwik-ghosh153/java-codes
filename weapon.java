import java.util.*;
class weapon
{
    static int N;
    static int val[][];
    static int count=0;
    static void make(int v[][])
    {
        System.out.println("hit1");
        int m=0;
        while(v[m][0]!=0)
            m++;
        for(int b=m+1;b<N;b++)
        {
            if(v[0][b]==1)
                continue;
            //fight
            for(int j=1;j<=10;j++)
            {
                if(v[m][j]==1 && v[b][j]==1)
                    v[m][j]=0;
                v[b][j]=0;
            }
            //decision
            int cm=0,cb=0;
            for(int j=1;j<=10;j++)
            {
                if(v[m][j]==1)
                    cm++;
                if(v[b][j]==1)
                    cb++;
            }
            //collect rewards
            if(cm>cb)
            {
                v[b][0]=1;
                for(int j=1;j<=10;j++)
                    if(v[b][j]==1)
                        v[m][j]=1;
                if(cm>count)
                    count=cm;
            }
            else
            {
                v[m][0]=1;
                for(int j=1;j<=10;j++)
                    if(v[m][j]==1)
                        v[b][j]=1;
                if(cb>count)
                    count=cb;
            }
            make(v);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            N=sc.nextInt();
            int val[][]=new int[N][11];
            for(int j=0;j<N;j++)
                val[j][0]=0;
            for(int j=0;j<N;j++)
            {
                String a=sc.next();
                for(int k=1;k<=10;k++)
                {
                    val[j][k]=Character.getNumericValue(a.charAt(k-1));
                }
            }
            make(val);
            System.out.println(count);
        }
    }
}
