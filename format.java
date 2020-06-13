import java.util.*;
class format
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String array[]=line.split(" ");
        double value=Double.parseDouble(array[0]);
        String type=array[1];
        value =value*2.20;
        String s = String.format("%.4f", value);
        value = Double.parseDouble(s);
        System.out.println(s);
        System.out.println(value);
    }
}
