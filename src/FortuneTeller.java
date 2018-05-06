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

		// Retirement Years
		int retirementNumber;
		if (currentAge % 2 == 0)
			// System.out.println("You can retire in 10 years.");
			retirementNumber = 10;
		else
			// System.out.println("You can retire in 20 years.");
			retirementNumber = 20;

		// Bank Balance

		String bankBalance = "";

		System.out.println("In which month were you born? Please enter the month using a number 1-12.");
		int birthMonth = input.nextInt();

		if (birthMonth > 1) {
			bankBalance = "$0.00";

		} else if (birthMonth <= 4) {
			bankBalance = "$256,000.76";

		} else if (birthMonth <= 8) {

			bankBalance = "$3,687,105.42";

		} else if (birthMonth <= 12) {

			bankBalance = "$86.23";

		} else if (birthMonth > 12) {
			bankBalance = "$0.00";
		}

		// ROYGBIV and Modes of Transportation
		System.out.println(
				"Please enter one of the ROYGBIV colors. If you're not sure which colors are ROYGBIV, please enter the word, help");
		String roygbiv = input.next();
		String modeOfTransportation = "";

		if (roygbiv.equals("red")) {
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

		} else if (roygbiv.equalsIgnoreCase("Help")) {
			System.out.println("Red; Orange; Yellow; Green; Blue; Indigo; Violet");

			System.out.println(
					"Please enter one of the ROYGBIV colors. If you're not sure which colors are ROYGBIV, please enter the word, help");
			roygbiv = input.next();
			System.out.println("Thank you.");
		}

		input.close();

		System.out.println(firstName + " " + lastName + " " + "will retire in " + " " + "with a bank balance of "
				+ bankBalance + " " + ", and will travel by " + modeOfTransportation);
	}

}
