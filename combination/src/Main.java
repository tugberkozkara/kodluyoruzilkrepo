import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a, b, aFac = 1, bFac = 1, abFac = 1, comb;

	Scanner scan = new Scanner(System.in);
	System.out.print("First number: ");
	a = scan.nextInt();

	System.out.print("Second number: ");
	b = scan.nextInt();

	for(int i=1;i<=a;i++){
	    aFac *= i;
    }
	for(int j=1;j<=b;j++){
	    bFac *= j;
    }
	for(int k=1;k<=a-b;k++){
	    abFac *= k;
    }
	comb = aFac / (bFac*abFac);
	System.out.println("C("+a+","+b+"): " + comb);
    }
}
