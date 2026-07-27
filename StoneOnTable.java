import java.util.*;

public class StoneOnTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberofstones = sc.nextInt();
        sc.nextLine();
        String colorofstones = sc.nextLine();
        int adjacentsame = 0;
        for(int i = 0 ; i < colorofstones.length()-1; i++){
            if (colorofstones.charAt(i) == colorofstones.charAt(i + 1)) {
            adjacentsame++;
        } 
        }
        System.out.println(adjacentsame);
    }
    
}
