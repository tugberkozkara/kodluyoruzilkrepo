import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a, b, c, perimeter;
	double u, area;

	Scanner inputs = new Scanner(System.in);

	System.out.print("First edge length: ");
	a = inputs.nextInt();
	System.out.print("Second edge length: ");
	b = inputs.nextInt();
	System.out.print("Third edge length: ");
	c = inputs.nextInt();

	perimeter = a + b + c;
	u = perimeter / 2.0;
    area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

    System.out.println("Perimeter of this triangle: " + perimeter);
    System.out.println("Area of this triangle: " + area);

    }
}
