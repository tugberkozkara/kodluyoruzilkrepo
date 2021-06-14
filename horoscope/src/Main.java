import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int day;
	String month;

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter the birthday: ");
	day = scan.nextInt();
	month = scan.nextLine();

	System.out.print("Horoscope of " + day +"th of"+ month + ": ");

	if(month.toLowerCase().equals(" january")){
		if (day<=21){
			System.out.println("Capricorn");
		}
		else if (day>21){
			System.out.println("Aquarius");
		}
	}
	else if(month.toLowerCase().equals(" february")){
		if (day<=19){
			System.out.println("Aquarius");
		}
		else if (day>19){
			System.out.println("Pisces");
		}
	}
	else if(month.toLowerCase().equals(" march")){
		if (day<=20){
			System.out.println("Pisces");
		}
		else if (day>20){
			System.out.println("Aries");
		}
	}
	else if(month.toLowerCase().equals(" april")){
		if (day<=20){
			System.out.println("Aries");
		}
		else if (day>20){
			System.out.println("Taurus");
		}
	}
	else if(month.toLowerCase().equals(" may")){
		if (day<=21){
			System.out.println("Taurus");
		}
		else if (day>21){
			System.out.println("Gemini");
		}
	}
	else if(month.toLowerCase().equals(" june")){
		if (day<=22){
			System.out.println("Gemini");
		}
		else if (day>22){
			System.out.println("Cancer");
		}
	}
	else if(month.toLowerCase().equals(" july")){
		if (day<=22){
			System.out.println("Cancer");
		}
		else if (day>22){
			System.out.println("Leo");
		}
	}
	else if(month.toLowerCase().equals(" august")){
		if (day<=22){
			System.out.println("Leo");
		}
		else if (day>22){
			System.out.println("Virgo");
		}
	}
	else if(month.toLowerCase().equals(" september")){
		if (day<=22){
			System.out.println("Virgo");
		}
		else if (day>22){
			System.out.println("Libra");
		}
	}
	else if(month.toLowerCase().equals(" october")){
		if (day<=21){
			System.out.println("Libra");
		}
		else if (day>21){
			System.out.println("Scorpio");
		}
	}
	else if(month.toLowerCase().equals(" november")){
		if (day<=21){
			System.out.println("Scorpio");
		}
		else if (day>21){
			System.out.println("Sagittarius");
		}
	}
	else if(month.toLowerCase().equals(" december")){
		if (day<=21){
			System.out.println("Sagittarius");
		}
		else if (day>21){
			System.out.println("Capricorn");
		}
	}
    }
}
