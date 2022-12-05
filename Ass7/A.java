import java.util.*;
class Room
{
   int width ,height,breadth;
   Room(int w, int h, int b)
    {
        width=w;
        height=h;
        breadth=b;
    }
    int volume()
    {
        return (width*height*breadth);
    }
}
class Roomdemo
{
    public static void main(String args[])
    {
        int width,height,breadth;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of the room 1:");
        System.out.print("Enter width=");
        width=sc.nextInt();
        System.out.print("Enter height=");
        height=sc.nextInt();
        System.out.print("Enter breadth=");
        breadth=sc.nextInt();
        Room r1=new Room(width,height,breadth);
        System.out.println("Volume="+r1.volume());
		System.out.println("Enter the details of the room 2:");
        System.out.print("Enter width=");
        width=sc.nextInt();
        System.out.print("Enter height=");
        height=sc.nextInt();
        System.out.print("Enter breadth=");
        breadth=sc.nextInt();
        sc.close();
        Room r2=new Room(width,height,breadth);
        System.out.println("Volume="+r2.volume());

    }
}
