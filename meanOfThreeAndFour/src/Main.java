import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int num, sum = 0;
	double average;
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a number: ");
	num = scan.nextInt();
    int k = 0;
	for(int i = 1; i <= num; i++ ){
	    if(i%3==0){
	        sum += i;
	        k ++;
        }else if(i%4==0){
	        sum += i;
	        k ++;
        }
    }
	average = sum/k;
	System.out.println("Mean of numbers divisible by 3 and 4: " + average);
    }
}
