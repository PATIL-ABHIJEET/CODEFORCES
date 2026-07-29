import java.util.Scanner;

public class AntonandDanik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // takes number of games played 
        String results = sc.next(); // takes the result of each game as a string
        int antonWins = 0; // variable to store number of games won by Anton initially its 0
        int danikins = 0; // variable stores number of games won by Danik initially its 0
        for(int i = 0; i < n ; i++){  // loop runs n times to take input of each game result 
            if(results.charAt(i) == 'A'){ // checks all index because loop runs n times
                antonWins++; // if the character at index i is 'A' anton wins increment by 1
            }else if(results.charAt(i)=='D'){ // checks if the character at index i is 'D' danik wins increment by 1
                danikins++;
            }
        }
        if(antonWins > danikins){
            System.out.println("Anton"); // if anton wins more games 
        }else if(danikins > antonWins){
            System.out.println("Danik"); // if danik wins more games
        }else{
            System.out.println("Friendship"); // if Anton == Danik 
        }
    }
}