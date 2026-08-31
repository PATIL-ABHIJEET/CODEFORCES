import java.util.Scanner;

public class CombinationLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String original = sc.next();
        String target = sc.next();
        int moves = 0;
        for (int i = 0; i < n; i++) {
            int a = original.charAt(i) - '0';
            int b = target.charAt(i) - '0';
            int difference = Math.abs(a - b);
            moves += Math.min(difference, 10 - difference);
        }
        System.out.println(moves);
    }
}