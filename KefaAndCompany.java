import java.util.*;

public class KefaAndCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long[][] friends = new long[n][2];
        for (int i = 0; i < n; i++) {
            friends[i][0] = sc.nextLong();
            friends[i][1] = sc.nextLong();
        }
        Arrays.sort(friends, (a, b) -> Long.compare(a[0], b[0]));
        long sum = 0;
        long answer = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            sum += friends[right][1];
            while (friends[right][0] - friends[left][0] >= d) {
                sum -= friends[left][1];
                left++;
            }
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}