import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int n = scan.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int m = n; m > 0 ; m--){
            for (int p = n-m; p>=0; p--){
                System.out.print(" ");
            }
            for (int r = 2*m-1; r>=1; r--){
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
