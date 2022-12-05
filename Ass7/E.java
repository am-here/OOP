import java.util.*;
class Rectangle
{
    void  rect(int n,char c)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    void rect(int l,int b,char c)
    {
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
        
    }
}
class Ass7E
{
    public static void main(String args[])
	{
    
        int a,l,b;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of square:");
        a=sc.nextInt();
		System.out.print("Enter character of square:");
        ch=sc.next().charAt(0);
		Rectangle r1=new Rectangle();
        r1.rect(a,ch);
        System.out.print("Enter length of rectangle:");
        l=sc.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b=sc.nextInt();
        System.out.print("Enter character of rectangle:");
        ch=sc.next().charAt(0);
        r1.rect(l,b,ch);
		sc.close();
	}

}