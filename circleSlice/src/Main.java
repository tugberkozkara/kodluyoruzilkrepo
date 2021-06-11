import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double radius, angle, sliceArea;
	double pi = 3.14;

	Scanner inputs = new Scanner(System.in);

	System.out.print("Enter the radius: ");
	radius = inputs.nextDouble();
	System.out.print("Enter the angle: ");
	angle = inputs.nextDouble();

	sliceArea = (pi * (radius*radius) * angle) / 360;

	System.out.println("Area of the slice: " + sliceArea);
    }
}
