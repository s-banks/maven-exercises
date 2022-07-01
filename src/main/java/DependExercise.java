import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class DependExercise {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter something.");
			String input = scanner.nextLine();
			System.out.printf("You entered: %s\n", input);
			if (StringUtils.isNumeric(input)) {
				System.out.println("Your input is a number");
			} else {
				System.out.println("Your input is not a number");
				System.out.printf("Your input with reverse casing is: %s\n", StringUtils.swapCase(input));
				System.out.printf("Your input reversed is: %s\n", StringUtils.reverse(input));
			}
		}
	}
