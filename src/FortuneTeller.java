import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstname = input.nextLine();

		System.out.println("What is your last name?");
		String lastname = input.nextLine();

		System.out.println("Hello " + firstname + " " + lastname + "." + " How old are you?");
		int age = input.nextInt();

		System.out.println("In which month were you born?");
		int birthmonth = input.nextInt();

		System.out.println("What is your favorite ROYGBIV color?");
		String roygbiv = input.next();

		String red = "red";

		if (red.equals("red")) {
			System.out.println("Like an apple.");
		}
		
		String orange = "orange";
		
		(orange.equals(orange)) {
			System.out.println("Like an orange.");
		}
		String yellow = "yellow";
		  (yellow.equals(yellow));

		input.close();

	}

}
