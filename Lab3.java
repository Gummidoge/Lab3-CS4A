import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user for student name
		System.out.print("Enter student name: ");
		String studentName = input.nextLine();

		// Output student name
		System.out.println("Hello " + studentName + "!");
	}
}