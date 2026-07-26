import java.util.*;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        HashSet<Character> uniqueChars = new HashSet<>();
        int lengthofName = name.length();

        for (int i = 0 ; i < lengthofName; i++){
            uniqueChars.add(name.charAt(i));
        }

        if (uniqueChars.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }

    
}}
