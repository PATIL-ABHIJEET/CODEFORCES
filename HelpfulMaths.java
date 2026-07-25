import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String s = sc.nextLine();

        // Split the string at '+'
        String[] arr = s.split("\\+");

        // Sort the numbers
        Arrays.sort(arr);

        // Print the sorted numbers separated by '+'
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print("+");
            }
        }

        sc.close();
    }
}