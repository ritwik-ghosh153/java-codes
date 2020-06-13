

class addition
{
	protected int a,b,c;
	addition(int x,int y,int z){
		a=x;
		b=y;
	}
	void sum()
	{
		System.out.println(a+b+c);
	}
}
class substraction extends addition
{
	substraction(int x,int y,int z){
		super(x,y,z);
	}
	void subtract()
	{
		System.out.println((a-b)-c);
	}
}
class calc{
	public static void main(String args[])
	{
		addition add=new addition(5,8,12);
		add.sum();
		substraction sub=new substraction(12,5,8);
		sub.subtract();
	}
}
