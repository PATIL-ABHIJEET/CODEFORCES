import java.util.*;

public class youngphysicist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumx = 0;
        int sumy = 0;
        int sumz = 0;
        for (int i = 0; i < n; i++){
            sumx += sc.nextInt();
            sumy += sc.nextInt();
            sumz += sc.nextInt();
        }
        if (sumx == 0 && sumy == 0 && sumz == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
