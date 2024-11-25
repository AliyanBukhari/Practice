import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print( (i + 1) + ": ");
            int number = scanner.nextInt();
            sum = sum + number;
        }

        int average = sum / n;
        System.out.println( average);
    }
}
