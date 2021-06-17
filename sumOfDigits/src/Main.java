import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num, sum = 0, rem;

	Scanner scan = new Scanner(System.in);
	System.out.print("Number: ");
	num = scan.nextInt();

	while(num>0){
	    rem = num%10;
	    sum += rem;
	    num = num/10;
    }
	System.out.println("Sum of the digits of number: " + sum);
    }
}
