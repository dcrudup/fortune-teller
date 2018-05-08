import java.util.Scanner;

public class VacationHome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

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
			vacationHome = "Ponta Negra,Brazil";

		} else if (numberOfSiblings == 3) {
			vacationHome = "Portland, Oregon";

		} else if (numberOfSiblings > 3) {
			vacationHome = "Baton Rouge, LA";
		}

		input.close();

	}
}
