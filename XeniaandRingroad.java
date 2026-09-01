import java.util.*;

public class XeniaandRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int currentPosition = 1;
        long totalTime = 0;

        for (int i = 0; i < m; i++) {
            int nextPosition = sc.nextInt();
            if (nextPosition >= currentPosition) {
                totalTime += nextPosition - currentPosition;
            } else {
                totalTime += n - currentPosition + nextPosition;
            }
            currentPosition = nextPosition;
        }
        System.out.println(totalTime);
    }
}