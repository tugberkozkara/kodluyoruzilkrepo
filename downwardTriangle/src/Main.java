import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int n = scan.nextInt();

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
