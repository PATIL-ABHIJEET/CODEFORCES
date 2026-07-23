import java.util.Scanner;

public class PetyaandStrings {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(); //reads the first string
        String str2 = sc.nextLine(); //reads the second string
        str1 = str1.toLowerCase(); //converts the first string to lowercase
        str2 = str2.toLowerCase(); //converts the second string to lowercase
        int result = str1.compareTo(str2);
        if(result < 0){
            System.out.println("-1"); //prints -1 if the first string is lexicographically less than the second string
        }else if(result > 0){
            System.out.println("1"); //prints 1 if the first string is lexicographically greater than the second string
        }else{
            System.out.println("0"); //prints 0 if the two strings are equal
        }
        
    }
    
}
