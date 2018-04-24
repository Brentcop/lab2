//Brent Coppinger Ver 0.0.1
import java.util.Scanner;

public class lab {

	public static void main(String[] args) {
		double area, perimeter, volume;
		char choice;
		do { //keeps loop open to make it bounce back if user types y

			Scanner in = new Scanner(System.in);

			System.out.println("Enter length");
			double length = in.nextDouble();

			System.out.println("Enter width: ");
			double width = in.nextDouble();

			System.out.println("Enter height");
			double height = in.nextDouble();

			area = width * length;// math
			perimeter = (width * 2) + (length * 2);
			volume = width * length * height;

			System.out.println("Area : " + area);// outputs
			System.out.println("Perimeter : " + perimeter);
			System.out.println("Volume : " + volume);

			System.out.print("Do You Want To Continue (Y/N)?: ");
			choice = in.next().charAt(0);
		}

		while ((choice != 'n') && (choice != 'N'));// User agreement
	}
}
