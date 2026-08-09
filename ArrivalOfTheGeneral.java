import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (height[i] > height[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int i = 1; i < n; i++) {
            if (height[i] <= height[minIndex]) {
                minIndex = i;
            }
        }

        int answer = maxIndex;

        if (maxIndex < minIndex) {
            answer += n - 1 - minIndex;
        } else {
            answer += n - 2 - minIndex;
        }

        System.out.println(answer);
    }
}