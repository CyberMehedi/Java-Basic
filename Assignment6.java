import java.util.Scanner;
public class Assignment6 {

public static void main(String[] args) {
		// create a program for digital spelling
		Scanner input = new Scanner(System.in);
		int digit;
		System.out.print("Enter any digit 0-9: ");
		digit = input.nextInt();
		if (digit == 0) {
			System.out.print("The number is Zero");
		}
		else if (digit == 1) {
			System.out.print("The number is One");
		}
		else if (digit == 2) {
			System.out.print("The number is Two");
		}
		else if (digit == 3) {
			System.out.print("The number is Three");
		}
		else if (digit == 4) {
			System.out.print("The number is Four");
		}
		else if (digit == 5) {
			System.out.print("The number is Five");
		}
		else if (digit == 6) {
			System.out.print("The number is Six");
		}
		else if (digit == 7) {
			System.out.print("The number is Seven");
		}
		else if (digit == 8) {
			System.out.print("The number is Eight");
		}
		else if (digit == 9) {
			System.out.print("The number is Nine");
		} else {
			System.out.println("Invalid digit, digit not in boundary of 0-9");
		}

	}
}