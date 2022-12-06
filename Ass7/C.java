import java.util.*;
class fibonacci
{
    void Fibo(int n,int a,int b)
	{
		if(n>0)
		{
			int c=a+b;
			a=b;
			b=c;
			int d=a+b;
			for(int i=c+1;i<d && n>0 ;i++)
			{
				System.out.print(i+" ");
				n--;
			}
			Fibo(n,a,b);
			
		}		
	}
}
class Ass7C
{
    public static void main(String args[])
    {
        int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms:");
		n=sc.nextInt();
		sc.close();
		fibonacci f=new fibonacci();
		f.Fibo(n,0,1);
	}
}