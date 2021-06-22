import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int amount, num1 = 0, num2 = 1, sum;

	Scanner scan = new Scanner(System.in);
	System.out.print("Number or elements: ");
	amount = scan.nextInt();

	for (int i=1; i<=amount; i++){
		System.out.print(num1+" ");
		sum = num1 + num2;
		num1 = num2;
		num2 = sum;
	}
    }
}
