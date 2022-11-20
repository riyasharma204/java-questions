import java.util.*;
import java.lang.String;

interface Area{
	final r = 10;
	final h = 15;
	void cal();
}

class Cone implements Area{
	
	public void cal()
	{
		double a ;
		a = (22*r*r*h)/21;
		System.out.println("The area of cone "+a);
	}
}

class Hemisphere implements Area{
	public void cal() {
		double a ;
		a = (2*22*r*r*r)/21;
		System.out.println("The area of Hemisphere"+a);
	}
}

class Cylinder implements Area{
	public void cal() {
		double a;
		a = (22*r*r*h)/7;
		System.out.println("The area of Cylinder"+a);
	}
}
public class Motive {
	public static void main(String args[]) {
		Cone c = new Cone();
		c.cal();
		
		Hemisphere h= new Hemisphere();
		h.cal();
		
		Cylinder cn = new Cylinder();
		cn.cal();
	}

}
