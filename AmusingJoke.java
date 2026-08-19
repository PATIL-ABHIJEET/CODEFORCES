import java.util.*;

public class AmusingJoke {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        if (s1.length() + s2.length() != s3.length()) {
            System.out.println("NO");
            return;
        }
        int count[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'A']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            count[s2.charAt(i) - 'A']++;
        }
        for (int i = 0; i < s3.length(); i++) {
            count[s3.charAt(i) - 'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }    
}
