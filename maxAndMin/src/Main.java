import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	int amount, num = 0, max = 0, min = 0;

	Scanner scan = new Scanner(System.in);
	System.out.print("How many numbers: ");
	amount = scan.nextInt();

	int[] arr = new int[amount];

	for(int i=0; i<arr.length; i++){
	    System.out.print("Enter number "+(i+1)+": ");
	    num = scan.nextInt();
	    arr[i] = num;
    }
	arr[0] = max;
	arr[0] = min;
	for(int j=0;j<arr.length; j++){
		if(arr[j]>=max){
			max = arr[j];
		}else if (arr[j]<min){
			min = arr[j];
		}
	}
	System.out.println(Arrays.toString(arr));
	System.out.println("Max: "+ max + "\nMin: " + min);
    }
}
