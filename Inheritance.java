import java.util.*;
class Circle
{
	double r,a;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter r:");
r=sc.nextDouble();
}
void process()
{
a=Math.PI*r*r;
}
void output()
{
System.out.println("area of circle :"+a);
}
}
class Cylinder extends Circle
{
	double h,v;
void input()
{
	super.input();
Scanner sc=new Scanner(System.in);
System.out.println("enter h:");
h=sc.nextDouble();
}
void process()
{
	super.process();
v=a*h;
}
void output()
{
System.out.println("volume of cylinder:"+v);
}
}
class Cone extends Cylinder
{
	double v;
	void input()
	{
	super.input();
	}
void process()
{
	super.process();
v=super.v/3;
}
void output()
{
System.out.println("volume of cone:"+v);
}
}
class InheritanceMain
{
public static void main(String arg[])
{
	Cylinder c= new Cone();
c.input();
c.process();
c.output();
}
}