import java.util.*;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> levels = new HashSet<>();
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            levels.add(sc.nextInt());
        }
        int y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            levels.add(sc.nextInt());
        }
        if (levels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}