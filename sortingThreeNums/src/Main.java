import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a,b,c;
	Scanner scan = new Scanner(System.in);

	System.out.print("First num: ");
	a = scan.nextInt();

	System.out.print("Second num: ");
	b = scan.nextInt();

	System.out.print("Third num: ");
	c = scan.nextInt();

	List<Integer> list = new ArrayList<Integer>();
	list.add(a);
	list.add(b);
	list.add(c);

	Collections.sort(list);

	System.out.println(list);

    }
}
