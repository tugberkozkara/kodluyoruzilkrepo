import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        num = scan.nextInt();

        for(int i=1; i<num; i++){
            if(num%i==0){
                sum += i;
            }
        }
        if (sum==num){
            System.out.print(num+" is a perfect number.");
        }else{
            System.out.print(num+" is NOT a perfect number.");
        }
    }
}
