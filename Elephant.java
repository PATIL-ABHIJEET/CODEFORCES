import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int elephantPosition = 0;
        int targetPosition = sc.nextInt();

        int stepsToReachTarget = targetPosition / 5;

        if(targetPosition % 5 != 0){
            stepsToReachTarget++;
        }else{
            stepsToReachTarget = targetPosition / 5;
        }
        System.out.println(stepsToReachTarget);
    }
}
