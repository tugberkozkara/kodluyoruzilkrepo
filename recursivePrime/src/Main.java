import java.util.Scanner;

public class Main {
    static boolean isPrime(int a, int b){

        if (a <= 2) {
            if (a == 2) {
                return true;
            } else {
                return false;
            }
        }
        if (a % b == 0){
            return false;
        }
        if (b * b > a){
            return true;
        }
        return isPrime(a, b+1);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scan.nextInt();
        if (isPrime(num, 2)){
            System.out.println(num + " sayısı ASALDIR !");
        }else{
            System.out.println(num + " sayısı ASAL DEĞİLDİR !");
        }
    }
}
