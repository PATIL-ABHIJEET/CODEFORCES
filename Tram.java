import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of stops

        int passengers = 0;   // current passengers in tram
        int capacity = 0;     // maximum passengers at any time

        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();

            passengers = passengers - exit; // passengers get off
            passengers = passengers + enter; // passengers get on

            if (passengers > capacity) {
                capacity = passengers;
            }
        }

        System.out.println(capacity);
    }
}