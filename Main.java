import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number of Fibonacci terms: ");
                int n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Please enter a positive number.");
                    return;
                }

                int a = 0, b = 1;
                System.out.print(a + " " + b);
                for (int i = 2; i < n; i++) {
                    int next = a + b;
                    System.out.print(" " + next);
                    a = b;
                    b = next;
                }
                System.out.println();
            }
        }
