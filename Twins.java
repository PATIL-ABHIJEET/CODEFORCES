import java.util.*;

public class Twins {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        int mysum = 0;
        for (int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        for (int i = n - 1 ; i >= 0 ; i--){
            mysum += arr[i];
            if(mysum > sum / 2){
                System.out.println(n - i);
                break;
            }
        }
    }
    
}
