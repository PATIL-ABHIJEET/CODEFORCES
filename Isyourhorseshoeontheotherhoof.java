import java.util.*;

public class Isyourhorseshoeontheotherhoof {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        HashSet<Integer> hs = new HashSet<Integer>();  // hashset stores unique values 
        
        for (int i = 0 ; i < 4 ; i++){
            int color = sc.nextInt(); // takes input of horseshoe color
            hs.add(color); // adds the horseshoe color to hashset
        }
        System.out.println(4 - hs.size()); // prints the number of horseshoes that need
    }
    
}
