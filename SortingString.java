import java.util.Arrays;

public class SortingString {
    public static void main(String[] args) {
        String str = "hello";
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        System.out.println("Sorted string: " + sortedStr);
    }
}
