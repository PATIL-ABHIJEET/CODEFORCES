import java.util.Scanner;

public class WordCapitalization {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String word = sc.nextLine();
        if (Character.isUpperCase(word.charAt(0))){
            System.out.println(word);
        }else{
            String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            System.out.println(capitalizedWord);
        }

    }
}
