import java.util.*;

public class Translation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // takes the string s input 
        String t = sc.nextLine(); // takes the string t input
        String empty = ""; // empty string to store the translated string
        for (int i = s.length() - 1 ; i >= 0 ; i --){ // adds the character of string s in reverse order to the empty string
            empty += s.charAt(i);
        }
            if(empty.equals(t)){
                System.out.println("YES"); // if the translated string is equal to string t print YES
            }else{
                    System.out.println("NO"); // if the translated string is not equal to string t print NO
            } 
    }
}
