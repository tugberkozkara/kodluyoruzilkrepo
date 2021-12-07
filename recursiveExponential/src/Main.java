import java.util.Scanner;
public class Main {

    static int exponential(int a, int b){
        if(b==0){
            return 1;
        }else{
            return a * exponential(a, b-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int baseNum = scan.nextInt();

        System.out.print("Üs değeri giriniz: ");
        int powerNum = scan.nextInt();

        System.out.println("Sonuç: " + exponential(baseNum, powerNum));
    }
}
