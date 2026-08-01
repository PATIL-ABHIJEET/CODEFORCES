import java.util.*;

public class GeorgeandAccommodation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // takes total no of rooms
        int freeplace = 0; // store the total no of rooms available for both george and alex
        for (int i = 0 ; i < n ; i++){
            int room1 = sc.nextInt(); // takes the no of people in room now
            int room1capacity = sc.nextInt(); // takes the capacity of the room
            if(room1capacity - room1 >= 2){ // if the room has capacity to accommodate both george and alex
                freeplace += 1; // increment the freeplace by 1
            }
        }
        System.out.println(freeplace);
    }
    
}
