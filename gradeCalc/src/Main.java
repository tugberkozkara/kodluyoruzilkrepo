import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int math,phys,chem,turk,hist,music;

        Scanner inputs = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = inputs.nextInt();

        System.out.print("Physics Grade: ");
        phys = inputs.nextInt();

        System.out.print("Chemistry Grade: ");
        chem = inputs.nextInt();

        System.out.print("Turkish Grade: ");
        turk = inputs.nextInt();

        System.out.print("History Grade: ");
        hist = inputs.nextInt();

        System.out.print("Music Grade: ");
        music = inputs.nextInt();

        int sum = math + phys + chem + turk + hist + music;
        double mean = sum / 6.0;
        System.out.println("Your average grade: " + mean);
        String b = (mean>=60) ? "Yes you've passed!": "No, you've failed!";
        System.out.print(b);

    }
}
