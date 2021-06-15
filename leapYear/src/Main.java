import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int year;
	boolean selection;

	Scanner scan = new Scanner(System.in);

	System.out.print("Year: ");
	year = scan.nextInt();

	if (year%4==0){
	    if (year%100==0){
	        if(year%400==0){
	            selection = true;
            }
	        else{
	            selection = false;
            }
        }
	    else{
	        selection = true;
        }
    }
	else{
	    selection = false;
    }

	if (selection == true){
	    System.out.println(year + " is a leap year.");
    }else{
	    System.out.println(year + " is not a leap year.");
    }
    }
}
