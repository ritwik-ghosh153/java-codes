import java.io.*;
import java.util.*;

public class Solution {
    static int N,M;
    int arr[][];
    
    boolean make(int a[][],int i,int j)
    {
        a[i][j]=1;
        if(i==(N-1) && j==(M-1))
        {
            
            arr=new int[N][M];
            arr=a;
            
            return true;
        }
        if(i<(N-1) && j<(M-1))
        {
            
            if(a[i][j+1]==3)
                if(make(a,i,(j+1)))
                    return true;
            if(a[i+1][j]==3)
            {
                if(make(a,(i+1),j))
                    return true;
            }
            
            
            
            
        }
        if(i==(N-1) && j<(M-1))
        {
            
            if(a[i][j+1]==3)
                if(make(a,i,(j+1)))
                    return true;
        }
        if(j==(M-1) && i<(N-1))
        {
            
            if(a[i+1][j]==3)
                if(make(a,(i+1),j))
                    return true;
        }
        a[i][j]=0;
        return false;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        Solution ob=new Solution();
        N=sc.nextInt();
        M=sc.nextInt();
        int a[][]=new int[N][M];
        for(int i=0;i<N;i++)
        {
            String z=sc.next();
            for(int j=0;j<M;j++)
            {
                char c=z.charAt(j);
                if(c=='O')
                    a[i][j]=3;
                else
                    a[i][j]=4;
            }
        }
        if(a[0][0]==4)
           System.out.println("-1");
        else
        {
            if(ob.make(a,0,0))
            {
                for(int i=0;i<N;i++)
                {
                    for(int j=0;j<M;j++)
                    {
                        if(ob.arr[i][j]!=1)
                            System.out.print("0 ");
                        else
                            System.out.print("1 ");
                    }
                    System.out.println();
                }
            }
            else
            {
                System.out.print("-1");
            }
            
        }
        
        
   }
}
