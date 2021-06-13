import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int selection;
	double num1, num2, result;

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter the first number: ");
	num1 = scan.nextDouble();

	System.out.print("Enter the second number: ");
	num2 = scan.nextDouble();

	System.out.println("1-Summation, 2-Subtraction, 3-Multiplication, 4-Division");
	System.out.print("Choose the operating type: ");
	selection = scan.nextInt();

	switch (selection){
		case 1:{
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;
        }
		case 2:{
	        result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
			break;
        }
		case 3:{
	        result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
			break;
        }
		case 4:{
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
			break;
        }
    }

    }
}
