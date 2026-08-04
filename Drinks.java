import java.util.*;

public class Drinks {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(); // takes the integer n input
        double sum = 0; // counter for the sum 
        for (int i = 0 ; i < n ; i++){
            sum += sc.nextInt(); // adds the next integer input to the sum
        }
        System.out.println(sum/n);
    }
}
