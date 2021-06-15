import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int distance, age, selection;
	double price;

	Scanner scan = new Scanner(System.in);

	System.out.print("Age: ");
	age = scan.nextInt();

	System.out.print("Distance: ");
	distance = scan.nextInt();

	System.out.print("1-One way, 2-Round trip\nTicket type?: ");
	selection = scan.nextInt();

	price = distance * 0.1;

	if (selection==1){
		if (age<12){
			price = price*0.5;
		}else if (12<=age && age<24){
			price = price*0.9;
		}else if (age>=65){
			price = price*0.7;
		}
		System.out.println("Price is: " + price);
	}
	else if (selection==2){
		price = price * 2;
		price = price * 0.8;
		if (age<12){
			price = price*0.5;
		}else if (12<=age && age<24){
			price = price*0.9;
		}else if (age>=65){
			price = price*0.7;
		}
		System.out.println("Price is: " + price);
	}
	else{
		System.out.println("Wrong Choice!");
	}
    }
}
