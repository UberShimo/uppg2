import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a LOWEST number and a HIGHEST number");

        System.out.print("Lowest: ");
        int low = sc.nextInt();
        System.out.print("Highest: ");
        int high = sc.nextInt();

        Guesser g = new Guesser(low, high);

        g.start();
    }
}
