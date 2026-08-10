import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch != 'a' && ch != 'o' && ch != 'y' &&
                ch != 'e' && ch != 'u' && ch != 'i') {
                result += "." + ch;
            }
        }

        System.out.println(result);
    }
}