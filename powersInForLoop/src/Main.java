import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int base,power, result = 1;

	Scanner scan = new Scanner(System.in);
	System.out.print("Base number: ");
	base = scan.nextInt();
	System.out.print("Power: ");
	power = scan.nextInt();

	for(int i = 1; i<=power; i++){
	    result *= base;
    }
	System.out.println(base+"^"+power+" = "+result);
    }
}
