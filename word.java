import java.util.*;

public class word {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine(); // takes the string s input
        int uppercase = 0; // counter for uppercase letters
        int lowercase = 0; // counter for lowercase letters
        for (int i = 0 ; i < s.length() ; i ++){ //loop that runs through the string s and counts the number of uppercase and lowercase letters
            if (Character.isUpperCase(s.charAt(i))){
                uppercase ++; // increments the uppercase 
            }else if (Character.isLowerCase(s.charAt(i))){
                lowercase ++; // increments the lowercase
            }
        }
        if (uppercase > lowercase){ // if the number of uppercase letters is greater than the number of lowercase letters
            System.out.println(s.toUpperCase());
        }else if (lowercase > uppercase){ // if the number of lowercase letters is greater than the number of uppercase letters
            System.out.println(s.toLowerCase());
        }else{ // if the number of uppercase and lowercase letters are equal
            System.out.println(s.toLowerCase());
        }

    }
    
}
