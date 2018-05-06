import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

		System.out.println("Hello " + firstName + " " + lastName + "." + " How old are you?");
		int currentAge = input.nextInt();

		System.out.println("In which month were you born? Please enter the month using a number 1-12.");
		int birthMonth = input.nextInt();

		System.out.println(
				"Please enter one of the ROYGBIV colors. If you're not sure which colors are ROYGBIV, please enter the word, help");
		String roygbiv = input.next();

		if (roygbiv.equalsIgnoreCase("red")) {
			System.out.println("Maserati");

		} else if (roygbiv.equalsIgnoreCase("orange")) {
			System.out.println("stallion");

		} else if (roygbiv.equalsIgnoreCase("yellow")) {
			System.out.println("chariot");

		} else if (roygbiv.equalsIgnoreCase("green")) {
			System.out.println("taxi");

		} else if (roygbiv.equalsIgnoreCase("blue")) {
			System.out.println("rickshaw");

		} else if (roygbiv.equalsIgnoreCase("indigo")) {
			System.out.println("motor scooter");

		} else if (roygbiv.equalsIgnoreCase("violet")) {
			System.out.println("flying saucer");

		} else if (roygbiv.equalsIgnoreCase("Help")) {
			System.out.println("Red; Orange; Yellow; Green; Blue; Indigo; Violet");

			System.out.println(
					"Please enter one of the ROYGBIV colors. If you're not sure which colors are ROYGBIV, please enter the word, help");
			roygbiv = input.next();
			System.out.println("Thank you.");
		}

		input.close();
	}

}
