import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    double price, kdv, taxedPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price: ");
        price = input.nextInt();

        kdv = (price>=1000) ? 0.08 : 0.18;
        taxedPrice = price + (price*kdv);

        System.out.println("Tax free price: " + price);
        System.out.println("Tax amount: " + price*kdv);
        System.out.println("Taxed price: " + taxedPrice);

    }
}
