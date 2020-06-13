import java.util.*;
class sudoku
{
    int game[][]=new int[9][9];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                game[i][j]=sc.nextInt();
            }
        }
    }
    boolean make(int g[][])
    {
        int i=-1,j=-1;
        boolean over=true;//true if game is finished
        for(int x=0;x<9;x++)//iterating each row and checking for vacancy
        {
            for(int y=0;y<9;y++)//iterating each column and checking for vacancy
            {
                if(g[x][y]==0)
                {
                    i=x;
                    j=y;
                    over=false;
                    break;
                }
            }
            if(!over)
                break;
        }
        if(over)
            return true;
        else
        {
            for(int k=1;k<=9;k++)//putting in numbers
            {
                if(check(g,i,j,k))
                {
                    g[i][j]=k;
                    if(make(g))
                    {
                        game=g;
                        return true;
                    }
                    else
                        g[i][j]=0;
                }
                
            }
        }
        return false;
    }
    boolean check(int g[][],int i,int j,int k)
    {
        for(int m=0;m<9;m++)//checking row
        {
            if(g[i][m]==k)
                return false;
        }
        for(int n=0;n<9;n++)//checking column
        {
            if(g[n][j]==k)
                return false;
        }
        int x=i;
        int y=j;
        x-=i%3;
        y-=j%3;
        for(int m=x;m<(x+3);m++)
        {
            for(int n=y;n<(y+3);n++)
            {
                if(g[m][n]==k)
                    return false;
            }
        }
        return true;
    }
    void print(int g[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(g[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        sudoku ob=new sudoku();
        ob.input();
        if(ob.make(ob.game))
            ob.print(ob.game);
        else
            System.out.print("fail");
    }
}
