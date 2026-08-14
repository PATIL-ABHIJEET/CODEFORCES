import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] calories = new int[4];
        for (int i = 0; i < 4; i++) {
            calories[i] = sc.nextInt();
        }
        String s = sc.next();
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int strip = s.charAt(i) - '1';
            total += calories[strip];
        }
        System.out.println(total);
    }
}