import java.util.*;

public class Dominopiling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //reads the number of dominoes
        int n = sc.nextInt(); //reads the number of dominoes
        int dominoes = (m*n)/2; //calculates the number of dominoes that can be placed
        System.out.println(dominoes);
    }
}