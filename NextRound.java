import java.util.Scanner;

public class NextRound {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //reads the number of participants
        int k = sc.nextInt(); //reads the minimum score required to advance
        int[] scores = new int[n]; //creates an array to store the scores of participants
        for(int i = 0; i < n ;i++){
            scores[i] = sc.nextInt();
        }
        int cutoffscore = scores[k-1]; //gets the score of the k-th participant
        int count = 0; //initializes a counter to count the number of participants who advance
        for(int i = 0; i < n ;i++){
            if(scores[i] >= cutoffscore && scores[i] > 0){
                count++;
            }
            
        }
        System.out.println(count); //prints the number of participants who advance
    } 
    
}
