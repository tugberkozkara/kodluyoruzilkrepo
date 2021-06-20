import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num1, num2, ekok = 1, ebob = 1;

	Scanner scan = new Scanner(System.in);
	System.out.print("First number: ");
	num1 = scan.nextInt();
	System.out.print("Second number: ");
	num2 = scan.nextInt();

	int i = 1;
	while(i<=num1*num2){
	    if(i%num1==0 && i%num2==0){
	        ekok = i;
	        break;
        }
	    i++;
    }
	ebob = (num1*num2)/ekok;
	System.out.println("Ekok: "+ekok);
	System.out.println("Ebob: "+ebob);
    }
}
