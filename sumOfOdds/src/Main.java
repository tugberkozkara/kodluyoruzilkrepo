import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num, sum = 0;
	double average;

	Scanner scan = new Scanner(System.in);

	do{
	    System.out.print("Enter a number: ");
	    num = scan.nextInt();
	    if(num%2==0){sum += num;}
    }while (num%2==0);

	System.out.print("Sum of entered even numbers: " + sum);
    }
}
