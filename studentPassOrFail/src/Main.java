import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int math, phys, turk, chem, music;
	double average = 0;

	Scanner scan = new Scanner(System.in);

	int i = 0;
	System.out.print("Math grade: ");
	math = scan.nextInt();
    if (0<=math && math<=100){
        average += math;
        i += 1;
    }

	System.out.print("Physics grade: ");
	phys = scan.nextInt();
	if (0<=phys && phys<=100){
	    average += phys;
        i += 1;
	}

	System.out.print("Turkish grade: ");
	turk = scan.nextInt();
	if (0<=turk && turk<=100){
	    average += turk;
        i += 1;
	}

	System.out.print("Chemistry grade: ");
	chem = scan.nextInt();
	if (0<=chem && chem<=100){
	    average += chem;
        i += 1;
	}

	System.out.print("Music grade: ");
	music = scan.nextInt();
	if (0<=music && music<=100){
	    average += music;
        i += 1;
	}

	average = average / i;

	if(average >= 55){
	    System.out.println("You've passed!");
    }
	else{
	    System.out.println("You've failed!");
    }
	System.out.println("Grade average: " + average);
    }
}
