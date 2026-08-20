import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashSet<Character> letters = new HashSet<>();
        for (int i = 0; i < n; i++) {
            letters.add(Character.toLowerCase(s.charAt(i)));
        }
        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}