import java.util.Scanner;

public class Program16 {

	public static void bot(String){
		Scanner scanner = new Scanner(System.in);
		
		int userInput = scanner.nextInt();
		
		if (userInput == 1) {
			System.out.println("Order confirmed");
		} else if (userInput == 2) {
			System.out.println("info@sololearn.com");
		} else {
			System.out.println("Try again");
		}
		
		scanner.close();
	}
	
	public static void main(String [] args) {
		bot();
	}
}
			