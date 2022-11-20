import java.util.Scanner;
import java.lang.String;

abstract class Shape {
	public abstract void rectangle_area(int l, int b);

	public abstract void square_area(int l);

	public abstract void circle_area(int r);

}

class area_shape extends Shape {
	public void rectangle_area(int l, int b) {
		int c = l * b;
		System.out.println("Area of the Rectangle");
		System.out.println(c);


	}

	public void square_area(int l) {
		int d = l * l;
		System.out.println("Area of the Square");
		System.out.println(d);


	}

	public void circle_area(int r) {
		double e = 3.14 * r * r;
		System.out.println("Area of the Circle");
		System.out.println(e);

	}
}

class Shape_area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
            System.out.println("Aryamann Singh , CE - 18");
		area_shape ob = new area_shape();
		boolean y=true;
		while(y) {
		int ch;
		System.out.println("Press 1 to calculate area of the rectangle");
		System.out.println("Press 2 to calculate area of the square");
		System.out.println("Press 3 to calculate area of the circle");
		System.out.println("Press 0 to exit");

		
		ch = sc.nextInt();
		switch (ch) {
		case 1: {
			System.out.println("Enter the length");
			int l = sc.nextInt();
			System.out.println("Enter the breadth");
			int b = sc.nextInt();
			ob.rectangle_area(l, b);
			break;

		}
		case 2: {
			System.out.println("Enter the length");
			int l = sc.nextInt();
			ob.square_area(l);
			break;
		}
		case 3: {
			System.out.println("Enter the radius");
			int r = sc.nextInt();
			ob.circle_area(r);
			break;
		}
			case 0:
			{
				y=false;
				break;
			}
		}
		}
	}
}