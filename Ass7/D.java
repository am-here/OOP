import java.util.*;
class Name
{
    String fname,mname,lname;
    Name(String f,String m, String l)
    {
        fname=f;
        mname=m;
        lname=l;
    }
}
class DOB
{
    int day,month,year;
    DOB(int d, int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }
}
class Student
{
    Name n;
    int id;
    String gender;
    DOB d;
    int m[]=new int[3];
    Student(Name n1,int i1,String g1,DOB d1,int m1[] )
    {
		n=n1;
		id=i1;
		gender=g1;
		d=d1;
		for(int j=0;j<3;j++)
			m[j]=m1[j];
	}
	void display()
	{
		System.out.println("\nStudent id:"+id);
		System.out.println("First Name :"+n.fname+"\nMiddle Name :"+n.mname+"\nLast name :"+n.lname);
		System.out.println("Date of Birth:"+d.day+"-"+d.month+"-"+d.year);
		System.out.println("Marks: English: "+m[0]+" Maths:"+m[1]+" Computer: "+m[2]);

	}
}
class Ass7D
{
	static void search(Student s1[],int s)
	{
		int i;
		for(i=0;i<s1.length;i++)
		{
			if(s==s1[i].id)
			{
				System.out.println("Student information :-");
				s1[i].display();
				break;
			}
		}
		if(i==s1.length)
			System.out.print("Not Found");
	}
    public static void main(String args[])
    {
		int n,id,d,m,y,s;
		String fn,mn,ln,g;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of student=");
		n=scan.nextInt();
		scan.nextLine();
		Student s1[]=new Student[n];
		int marks[]=new int[3];
		for(int i=0;i<n;i++)
		{
			System.out.println("\n\nStudent No." +(i+1));
			System.out.print("Enter the student id=");
			id=scan.nextInt(); 
			scan.nextLine();
			System.out.print("Enter first name:-");
			fn=scan.nextLine();
			System.out.print("Enter middle name:-");
			mn=scan.nextLine();
			System.out.print("Enter last name:-");
			ln=scan.nextLine();
			System.out.print("Enter gender=");
			g=scan.nextLine();
			System.out.print("Enter day,month and year of DOB seperated by space=");
			d=scan.nextInt();
			m=scan.nextInt();    
			y=scan.nextInt();        
			System.out.print("Enter the marks of English,Mathematics and Computer Science seperated by space=");
			marks[0]=scan.nextInt();
			marks[1]=scan.nextInt();
			marks[2]=scan.nextInt();			
			Name n1 =new Name(fn,mn,ln);
			DOB b1=new DOB(d,m,y);
			s1[i]=new Student (n1,id,g,b1,marks);
		}
		System.out.print("Enter the id to search=");
		s=scan.nextInt();
		scan.close();
		search(s1,s);
	}
}