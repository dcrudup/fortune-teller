import java.util.Scanner;

public class PartTwo {

	public static void main(String[] args) {

		int x;
		System.out.println("How old are you?");
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();

		int retirementNumber; 
		if (x % 2 == 0)
			//System.out.println("You can retire in 10 years.");
			retirementNumber = 10;
		
		else	
			//System.out.println("You can retire in 20 years.");
			retirementNumber = 20;
	}

}
