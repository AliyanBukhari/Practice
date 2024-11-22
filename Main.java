import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                long result = factorial(num);
                System.out.println("Factorial of " + num + " is: " + result);
            }
            public static long factorial(int num) {
                if (num == 0 || num == 1) {
                    return 1;
                }
                long fact = 1;
                for (int i = 2; i <= num; i++) {
                    fact *= i;
                }
                return fact;
            }
        }



