import java.util.Scanner;
class Area{
float length ,  breadth , radius , side , base , height;
void getdata1(float l , float b)
{
length = l;
breadth = b;
}

void getdata2(float r)
{
radius = r;
}

void getdata3(float s);
{
side = s;
}

void getdata4(float b , float h);
{
base = b;
height = h;
}
}

class NewArea{
public static void main(String args[]){
float rarea;
Area a = new Area();
a.getdata1(5 , 6);
rarea = a.length*a.breadth;
System.out.println("The area of rectangle is:"+rarea);
}
}

class NewArea{
public static void main(String args[]){
float carea;
Area b = new Area();
b.getdata2(4);
carea = Math.PI*b.radius*b.radius;
System.out.println("The area of circle is:"+carea);
}
}

class NewArea{
public static void main(String args[]){
float sarea;
Area c = new Area();
c.getdata3(6);
sarea = c.side*c.side;
System.out.println("The area of square is:"+sraea);
}
}

class NewArea{
public static void main(String args[]){
float tarea;
Area d = new Area();
d.getdata4(5 , 6);
tarea = (d.base*d.height)/2.0;
System.out.println("The area of triangle:"+tarea);
}
}