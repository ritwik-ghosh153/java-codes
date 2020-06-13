//Mr. X at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of
//integers representing the color of each sock, determine how many pairs of socks with matching colors
//there are.
//For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2]. There is one pair of color 1 and one
//of color 2. There are three odd socks left, one of each color. The number of pairs is 2.
//
//It must return an integer representing the number of matching pairs of socks that are available.
//The function has the following parameter(s):
// n: the number of socks in the pile
// ar: the colors of each sock
//Input Format
//The first line contains an integer n, the number of socks represented in ar.
//The second line contains n space-separated integers describing the colors ar [i] of the socks in the pile.
import java.util.*;
class sock{
int n;
int ar[];
sock(int nn, int arr[]){
n=nn;
ar=arr;
}
int pair(){
int pairs=0;
int unique=ar[0];
for(int i=0;i<n;i++){
if(ar[i]<unique)
unique=ar[i];
}
unique--;
boolean left=true;
for(int i=0;i<n-1;i++){
if(ar[i]!=unique){
for(int j=i+1;j<n;j++){

if(ar[j]==ar[i]){

ar[j]=unique;
ar[i]=unique;
	break;
}

}
}
}
for(int i=0;i<n;i++){

if(ar[i]==unique){
pairs++;
}
}
pairs/=2;
return pairs;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int nn=sc.nextInt();
int arr[]=new int[nn]; for(int i=0;i<nn;i++){
arr[i]=sc.nextInt();
}
sock ob=new sock(nn,arr);
System.out.print(ob.pair());
}
}
