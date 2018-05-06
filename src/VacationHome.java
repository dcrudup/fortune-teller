import java.util.Scanner;

public class VacationHome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double numberOfSiblings = 0;

		System.out.println("How many siblings do you have?");
		numberOfSiblings = input.nextDouble();

		if (numberOfSiblings < 0) {
			System.out.println("Chernobyl, Ukraine");

		} else if (numberOfSiblings == 0) {
			System.out.println("Boca Raton, FL");

		} else if (numberOfSiblings == 1) {
			System.out.println("Nassau, Bahamas");

		} else if (numberOfSiblings == 2) {
			System.out.println("Ponta Negra,Brazil");

		} else if (numberOfSiblings == 3) {
			System.out.println("Portland, Oregon");

		} else if (numberOfSiblings > 3) {
			System.out.println("Baton Rouge, LA");
		}

		input.close();

	}
}
