import java.util.*;

public class VanyaandFence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // takes number of friends
        int h = sc.nextInt();// takes height of fence
        int width = 0; // store the total width needed
        for(int i = 0 ; i < n ; i++){
            int height = sc.nextInt(); // taking height of friends
            if(h < height){ // if height of fence is smaller +2
                width += 2;
            }
            else{ // if height of fence is greater +1
                width += 1;
            }
        }
        System.out.println(width);
    }
}
