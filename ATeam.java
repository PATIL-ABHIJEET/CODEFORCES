import java.util.*;

public class ATeam {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //reads no of problems ex 3problems then n=3

        int count = 0; //count of problems solved by at least 2 people

        for(int i = 0; i < n; i++){

        int a = sc.nextInt(); //reads pety's solution
        int b = sc.nextInt(); //reads vasya's solution
        int c = sc.nextInt(); //reads tonya's solution
        
        int sum = a+b+c; //count how many friends know the solution of the problem

        if(sum >= 2){ //check whether 2 of them know to solve the problem or not
            count++; //increment the count of problems solved by at least 2 people
        }
    }
    System.out.println(count); //print the count of problems solved by at least 2 people
    sc.close();
    }
}
