import java.util.Scanner;

public class CharachterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter a character to count:");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count = count + 1;
            }
        }

        System.out.println("The character " + ch + " appears " + count + " times.");
    }
}
