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
			System.out.println("Remaining sticks: " + total);
			System.out.println("Enter the amount to deduct player 2: ");
			total -= scanner.nextInt();
		}while (total > 0);
	}
}
