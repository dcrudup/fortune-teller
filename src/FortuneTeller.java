import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Part 1
		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("Hello " + firstName + " " + lastName + "." + " How old are you?");
		int currentAge = input.nextInt();

		int retirementNumber;

		if (currentAge % 2 == 0)
			// Retire in 10 years
			retirementNumber = 10;
		else
			// Retire in 20 years
			retirementNumber = 20;

		// Bank Balance

		String bankBalance = "";

		System.out.println("In which month were you born? Please enter the month using a number 1-12.");
		int birthMonth = input.nextInt();

		if (birthMonth < 1) {
			bankBalance = "$0.00";

		} else if (birthMonth <= 4) {
			bankBalance = "$256,000.76";

		} else if (birthMonth <= 8) {

			bankBalance = "$3,687,105.42";

		} else if (birthMonth <= 12) {
			bankBalance = "$86.23";
		}

		// ROYGBIV and Modes of Transportation
		System.out.println(
				"Please enter one of the ROYGBIV colors. If you're not sure which colors are ROYGBIV, please enter the word, help");

		String roygbiv = input.next();
		String modeOfTransportation = "";

		if (roygbiv.equalsIgnoreCase("Help")) {
			System.out.println("Red; Orange; Yellow; Green; Blue; Indigo; Violet. Please enter your chosen color.");
			roygbiv = input.next();
		}

		if (roygbiv.equalsIgnoreCase("red")) {
			modeOfTransportation = "Maserati";

		} else if (roygbiv.equalsIgnoreCase("orange")) {
			modeOfTransportation = "stallion";

		} else if (roygbiv.equalsIgnoreCase("yellow")) {
			modeOfTransportation = "chariot";

		} else if (roygbiv.equalsIgnoreCase("green")) {
			modeOfTransportation = "taxi";

		} else if (roygbiv.equalsIgnoreCase("blue")) {
			modeOfTransportation = "rickshaw";

		} else if (roygbiv.equalsIgnoreCase("indigo")) {
			modeOfTransportation = "motor scooter";

		} else if (roygbiv.equalsIgnoreCase("violet")) {
			modeOfTransportation = "flying saucer";
		}

		// Vacation Home
		double numberOfSiblings = 0;
		String vacationHome = "";

		System.out.println("How many siblings do you have?");
		numberOfSiblings = input.nextDouble();

		if (numberOfSiblings < 0) {
			vacationHome = "Chernobyl, Ukraine";

		} else if (numberOfSiblings == 0) {
			vacationHome = "Boca Raton, FL";

		} else if (numberOfSiblings == 1) {
			vacationHome = "Nassau, Bahamas";

		} else if (numberOfSiblings == 2) {
			vacationHome = "Ponta Negra, Brazil";

		} else if (numberOfSiblings == 3) {
			vacationHome = "Portland, Oregon";

		} else if (numberOfSiblings > 3) {
			vacationHome = "Baton Rouge, LA";
		}

		input.close();
		
		System.out.println("");

		System.out.println(firstName + " " + lastName + " " + "will retire in " + retirementNumber + " "
				+ "years, with a bank balance of " + bankBalance + ", in a vacation home in " + vacationHome
				+ ", and will travel by " + modeOfTransportation + ".");
	}

}