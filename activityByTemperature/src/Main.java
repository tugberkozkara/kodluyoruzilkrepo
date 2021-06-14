import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int temperature;

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter the air temperature: ");
	temperature = scan.nextInt();

	if(temperature<5){
	    System.out.println("You can go skiing!");
    }
	if(5<=temperature && temperature<15){
        System.out.println("You can go to the cinema!");
    }
	if(10<=temperature && temperature<25){
	    System.out.println("You can go on a picnic!");
    }
	if(25<=temperature){
	    System.out.println("You can go swimming!");
    }

    }
}
