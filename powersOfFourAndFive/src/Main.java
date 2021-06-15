import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num;

	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the limit number: ");
	num = scan.nextInt();

	for(int i = 0; i <= num; i++){
		if(Math.pow(4,i) <= num){
			System.out.print(Math.pow(4,i)+"   ");
			if(Math.pow(5,i) <= num){
				System.out.println(Math.pow(5,i));
			}
		}
    }
    }
}
