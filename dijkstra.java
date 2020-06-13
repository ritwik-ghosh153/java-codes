import java.util.*;
class dijkstra
{
	int weights[][];
	int src,dest;
	dijkstra(int s,int d,int a[][])
	{
		weights=a;
		src=s;
		dest=d;
	}
	boolean find(int c,int flag[])//c=current node, flag=for nodes already visited
	{
		int adj[]=new int[weights[c].length];//stores adjacent nodes to current node
		int wt[]=new int[adj.length];//stores weights of adjacent edges
		int ap=0;//pointer to adjacent array
		for(int j=0;j<weights[c].lenght;j++)
		{
			if(weights[c][j]!=0)
				adj[j]=weights[c][j];
			else
				adj[j]=-1;
		}
	}
}
