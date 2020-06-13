import java.util.*;
class check
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        try
        {
            if(a==5)
                throw new myexception ("a=5");
            else
                System.out.println("Accepted");
        }
        catch(myexception e)
        {
            System.out.println("a is not equal to 5");
        }
    }
}
