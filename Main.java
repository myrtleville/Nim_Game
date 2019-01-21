import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int 
		int total = 21;
		int player1;
		int player2;

		do{System.out.print("Enter the amount to deduct:");
		player1 = scanner.nextInt();
		total = total - player1;
		}while (total > 0);
	}
}
