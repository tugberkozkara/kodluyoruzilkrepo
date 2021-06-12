import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int weight;
	double bmi, height;

	Scanner inputs = new Scanner(System.in);

	System.out.print("Enter the height (in m): ");
	height = inputs.nextDouble();
	System.out.print("Enter the weight (in kg): ");
	weight = inputs.nextInt();

	bmi = weight/(height*height);

	System.out.print("Body Mass Index: " + bmi);
    }
}
