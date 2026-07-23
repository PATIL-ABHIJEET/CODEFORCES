import java.util.Scanner;

public class Bitplusplus {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); //reads no of operations ex 3operations then n
    
    int x = 0; //initial value of x

    for (int i = 0; i < n; i++){
        String s = sc.next(); //reads the operation performed by the programmer
        if (s.equals("++X") || s.equals("X++")) {
            x++;
        } else if (s.equals("--X") || s.equals("X--")) {
            x--;
        }
    }
    System.out.println(x);
    sc.close();
    }
}
