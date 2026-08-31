import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        char direction = sc.nextLine().charAt(0);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int index = keyboard.indexOf(s.charAt(i));

            if (direction == 'R') {
                result += keyboard.charAt(index - 1);
            } else {
                result += keyboard.charAt(index + 1);
            }
        }
        System.out.println(result);
    }
}