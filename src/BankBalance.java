import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String bankBalance = "";

		System.out.println("In which month were you born? Please enter the month using a number 1-12.");
		int birthMonth = input.nextInt();

		if (birthMonth > 1) {
			bankBalance = "$0.00.";
			

		} else if (birthMonth <= 4) {
			bankBalance = "$256,000.76.";

		} else if (birthMonth <= 8) {

			bankBalance = "$3,687,105.42.";

		} else if (birthMonth <= 12) {

			bankBalance = "$86.23.";

		} else if (birthMonth > 12) {
			bankBalance = "$0.00.";
		}
		
		input.close();
	}

}
