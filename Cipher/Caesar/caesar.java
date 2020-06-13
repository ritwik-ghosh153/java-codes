import java.util.*;
import java.io.*;
class caesar
{
    String text;
    String z="";
    static Scanner sc=new Scanner(System.in);
    //static File inp=new File("/Users/ritwikghosh/Desktop/inp.txt");
    static File inp=new File(System.getProperty("user.dir")+"/inp.txt");
    
    static File out=new File(System.getProperty("user.dir")+"/out.txt");
    
    char key;
    void input()
    {
        try
        {
            Scanner scf=new Scanner(inp);
            while(scf.hasNextLine())
            {
                text+=scf.nextLine();
            }
        }
        catch(Exception e){}
        
        //text=sc.nextLine();
        System.out.println("Enter the key");
        key=sc.next().charAt(0);
    }
    void make()
    {
        text.trim();
        text=text.toUpperCase();
        char put;
        int s=(int)key-65;
        for(int i=4;i<text.length();i++)
        {
            put=text.charAt(i);
            if((int)put>=65 && put<=90)
            {
                if(s+(int)(put)<=90)
                {
                    z+=(char)((int)put+s);
                }
                if(s+(int)(put)>90)
                {
                    z+=(char)((int)put+s-26);
                }
            }
            else
                z+=put;
            
        }
    }
    void print() //throws IOException
    {
        try
        {
            FileWriter writer = new FileWriter(out);
            //System.setOut(ps);
            writer.write(z);
            writer.close();
        }
        catch(Exception e){}
    }
    public static void main(String args[])
    {
        /*
        try{
        PrintStream ps=new PrintStream(out);
        Scanner scf=new Scanner(inp);
        Scanner sc=new Scanner(System.in);
    }
        catch(Exception e){}
         */
        
        caesar ob=new caesar();
        ob.input();
        ob.make();
        ob.print();
    }
}
