import java.io.*;
import java.util.*;

public class Solution1 {
    
    /*static int check(int x,int y)
    {
        int x1=0,y1=0;
        while(x>0)
        {
            if(x%2==1)
                x1++;
            x/=2;
        }
        while(y>0)
        {
            if(y%2==1)
                y1++;
            y/=2;
        }
        if(x1>y1)
            return 0;
        else if(y1>x1)
            return 1;
        else
            return 2;
    }
     */
    static int count(int x)
    {
        int one=0;
        while(x>0)
        {
            if(x%2==1)
                one++;
            x/=2;
        }
        return one;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        int a[]=new int [n];
        int x[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            x[i]=count(a[i]);
        }
        for(int i=0;i<(n-1);i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(x[j]>x[j+1])
                {
                    a[j]=a[j]+a[j+1];
                    a[j+1]=a[j]-a[j+1];
                    a[j]=a[j]-a[j+1];
                    
                    x[j]=x[j]+x[j+1];
                    x[j+1]=x[j]-x[j+1];
                    x[j]=x[j]-x[j+1];
                }
                else if(x[j]==x[j+1])
                {
                    if(a[j]>a[j+1])
                    {
                        a[j]=a[j]+a[j+1];
                        a[j+1]=a[j]-a[j+1];
                        a[j]=a[j]-a[j+1];
                    }
                }
            }
        }
    
                    
        /*
        for(int i=0;i<(n-1);i++)
        {
            for(int j=0;j<(n-i-1);j++)
            {
                if(check(a[j],a[j+1])==0)
                {
                    t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
                else if(check(a[j],a[j+1])==2)
                {
                    if(a[j]>a[j+1])
                    {
                        t=a[j+1];
                        a[j+1]=a[j];
                        a[j]=t;
                    }
                }
            }
        }
         */
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        
    }
}
