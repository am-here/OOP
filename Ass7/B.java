import java.util.*;
class Tower
{
	void TOH(int n,char f,char a,char t)
	{
		if(n==1)
			System.out.println("Move disk " +n+" from rod "+f+ " to rod "+t);
		else
		{
			TOH(n-1,f,t,a);
			System.out.println("Move disk " +n+" from rod "+f+ " to rod "+t);
			TOH(n-1,a,f,t);
		}
	}
}
class Ass7B
{
	
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of disc:");
		n=sc.nextInt();
		sc.close();
		Tower t=new Tower();
		t.TOH(n,'A','B','C');
	}
}