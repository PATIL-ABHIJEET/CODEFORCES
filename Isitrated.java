import java.util.Scanner;

public class Isitrated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] before = new int[n];
        int[] after = new int[n];
        int changed = 0;
        int wrongOrder = 0;
        
        for (int i = 0; i < n; i++) {
            before[i] = sc.nextInt();
            after[i] = sc.nextInt();
            if (before[i] != after[i]) {
                changed = 1;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (before[i] < before[i + 1]) {
                wrongOrder = 1;
            }
        }

        if (changed == 1) {
            System.out.println("rated");
        } else if (wrongOrder == 1) {
            System.out.println("unrated");
        } else {
            System.out.println("maybe");
        }
    }
}
