import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user for first and last name
		System.out.print("Enter student's first name: ");
		String firstName = input.next();
		System.out.print("Enter student's last name: ");
		String lastName = input.next();

		// Output student first and last name
		System.out.println("Hello " + firstName + " " + lastName + "!");
	}
}