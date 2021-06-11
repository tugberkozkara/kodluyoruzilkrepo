import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double km, cost;

	Scanner inputs = new Scanner(System.in);

	System.out.print("Enter the distance: ");
	km = inputs.nextDouble();

	cost = 10 + km*2.20;
	cost = (cost<20) ? 20 : cost;

	System.out.println("The cost is: " + cost);
    }
}
