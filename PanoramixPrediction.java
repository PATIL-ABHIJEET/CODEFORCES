import java.util.*;

public class PanoramixPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = n+1; i <= m; i++) {
            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                    
                }
            }

        if(isPrime){
            if(i == m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                break;
            }
        }
        }
    }
}
