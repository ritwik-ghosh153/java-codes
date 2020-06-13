import java.util.*;
class test
{
    static Scanner sc=new Scanner(System.in);
    int sum=0;//total sum
    int m[][];//main matrix
    static int l,b;//length and breadth of matrix
    int seq[];//sequence of elements
    void input()
    {
        System.out.println("Enter the length and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
        m=new int[l][b];
        seq=new int[(l+b)];
        for(int i=0;i<seq.length;i++)
            seq[i]=-1;
        System.out.println("Enter the matrix");
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<b;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
    }
    void move(int i, int j, int s, int arr[])
    {
        if(i!=(l-1))//downwards
        {
            arr[i+j]=m[i][j];
            s+=m[i][j];
            System.out.println("Sum="+s);
            //System.out.print("i="+i+"j="+j);
            System.out.println("downwards");
            //System.out.print("arr=");
            //for(int p=0;p<arr.length;p++)
            //{
            //    System.out.print(arr[p]);
            //}
            //System.out.println();
            move(i+1,j,s,arr);
            
        }
        if(j!=(b-1))//rightwards
        {
            arr[i+j]=m[i][j];
            if(!(i==0 && j==0))
                s+=m[i][j];
            //System.out.println("Sum="+s);
            //System.out.print("i="+i+"j="+j);
            //System.out.println("rightwards");
            //System.out.print("arr=");
            //for(int p=0;p<arr.length;p++)
            //{
            //    System.out.print(arr[p]);
            //}
            //System.out.println();
            move(i,j+1,s,arr);
        }
        if(i==(l-1) && j==(b-1))
        {
            //System.out.println("End");
            s+=m[i][j];
            //System.out.println("Sum="+s);
            arr[i+j]=m[i][j];
            //System.out.print("arr=");
            //for(int p=0;p<arr.length;p++)
            //{
            //    System.out.print(arr[p]);
            //}
            //System.out.println();
        }
        s=0;
        for(int p=0;p<arr.length;p++)
        {
            s+=arr[p];
        }
        System.out.println("SUM="+s);
        if(sum<s)
        {
            System.out.println("Hit");
            sum=s;
            System.out.println("HitSum="+sum);
            seq=arr;
            System.out.print("seq=");
            for(int p=0;p<seq.length;p++)
            {
                System.out.print(seq[p]+" ");
            }
        }
    }
    public static void main(String args[])
    {
        test ob=new test();
        ob.input();
        int a[]=new int[(l+b-1)];
        for(int i=0;i<a.length;i++)
            a[i]=-1;
        ob.move(0,0,0,a);
        System.out.print("seq=");
        for(int i=0;i<ob.seq.length;i++)
        {
            System.out.print(ob.seq[i]+" ");
        }
    }
}
