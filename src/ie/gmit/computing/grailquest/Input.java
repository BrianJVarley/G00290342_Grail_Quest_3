package ie.gmit.computing.grailquest;

import java.util.Scanner;

/**
 * @author Brian Varley
 *
 */
public class Input {

	public static String getInput() {

		System.out.print("Enter Command > ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		input.toLowerCase();
		return input;
	}
}