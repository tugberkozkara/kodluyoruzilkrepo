import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double pear, apple, tomato, banana, eggplant, price;

	Scanner inputs = new Scanner(System.in);

	System.out.print("How much pears?: ");
	pear = inputs.nextDouble();

	System.out.print("How much apples?: ");
	apple = inputs.nextDouble();

	System.out.print("How much tomatoes?: ");
	tomato = inputs.nextDouble();

	System.out.print("How much bananas?: ");
	banana = inputs.nextDouble();

	System.out.print("How much eggplants?: ");
	eggplant = inputs.nextDouble();

	price = (2.14*pear) + (3.67*apple) + (1.11*tomato) + (0.95*banana) + (5.0*eggplant);

	System.out.println("Total cost is: " + price + " TL");
    }
}
