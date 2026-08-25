import java.util.Scanner;

public class GameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int moves = Math.min(n, m); // minimum value in n and m 
     // If the number of moves is odd akshat wins
     // If the number of moves is even malvvika wins

        if (moves % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }
}    
