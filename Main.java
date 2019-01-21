import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int
		int total = 21;
		int player1;
		int player2;

		do{
			System.out.println("Remaining sticks: " + total);
			System.out.print("Enter the amount to deduct player 1: ");
			total -= scanner.nextInt();
			if (total == 0) {
				System.out.println("player 2 won");
				break;
			}
			System.out.println("Remaining sticks: " + total);
			System.out.println("Enter the amount to deduct player 2: ");
			total -= scanner.nextInt();
			if (total == 0) {
				System.out.println("player 1 won");
				break;
			}
		}while (total > 0);
	}
}
