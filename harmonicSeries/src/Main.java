import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num;

	Scanner scan = new Scanner(System.in);
	System.out.print("Number: ");
	num = scan.nextInt();

	while(num>0){
	    System.out.print("1/"+num+" ");
	    num -= 1;
    }
    }
}
