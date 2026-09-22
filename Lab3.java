import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user for first and last name
		System.out.print("Enter student's first name: ");
		String firstName = input.next();
		System.out.print("Enter student's last name: ");
		String lastName = input.next();

		// Output student first and last name with enthusiam
		System.out.println("Hello " + firstName + " " + lastName + "! What an awesome name!");

		// Prompt and output an ID number with enthusiasm
		System.out.print("\nWhat is your ID number? ");
		int id = input.nextInt();
		System.out.println("Your ID number is currently " + id + ". Wow! ");
	}
}