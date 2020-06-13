import java.util.*;
//import Caesar.*;
import java.io.*;
class solve_cas
{
    static File inp=new File(System.getProperty("user.dir")+"/inp.txt");
    static File out=new File(System.getProperty("user.dir")+"/out.txt");
    double dist[]={8.167,1.492,2.782,4.253,12.702,2.228,2.015,6.094,6.966,0.153,0.772,4.025,2.406,6.749,7.507,1.929,0.095,5.987,6.327,9.056,2.758,0.978,2.360,0.150,1.974,0.074};
    double pract[]=new double[26];//to store distribution of cipher
    double error[]=new double[26];//to store error
    String text="";
    String answer="";
    solve_cas()
    {
        for(int i=0;i<26;i++)
        {
            pract[i]=error[i]=0;
        }
    }
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
        text=text.toUpperCase();
        text.trim();
    }
    void find()//finds probability distribution of given text
    {
        char c; int count=0;
        for(int i=0;i<text.length();i++)
        {
            c=text.charAt(i);
            if((int)c>=65 && (int)c<=90)
            {
                pract[((int)c-65)]++;
                count++;
            }
        }
        for(int i=0;i<26;i++)
            pract[i]/=count;
        for(int i=0;i<26;i++)
        {
            double sum=0;
            for(int j=0;j<26;j++)
            {
                sum+=(dist[(j+i)%26]-pract[j])*(dist[(j+i)%26]-pract[j]);
            }
            error[i]=sum;
        }
        int min=0;
        for(int i=1;i<26;i++)
        {
            if(error[i]<error[min])
                min=i;
        }
        caesar cs=new caesar();
        cs.text=text;
        cs.key=(char)(65+min);
        cs.make();
        answer=cs.z;
        
            
    }
    void print() //throws IOException
    {
        try
        {
            FileWriter writer = new FileWriter(out);
            //System.setOut(ps);
            writer.write(answer);
            writer.close();
        }
        catch(Exception e){}
    }
    public static void main(String args[])
    {
        solve_cas ob=new solve_cas();
        ob.input();
        ob.find();
        ob.print();
    }
}
