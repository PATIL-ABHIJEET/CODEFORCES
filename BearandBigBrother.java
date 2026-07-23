import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //reads the weight of Limak
        int b = sc.nextInt(); //reads the weight of bob
        int yearsPassed = 0;

        while(a<=b){
            a = a*3; //Limak's weight triples
            b = b*2; //Bob's weight doubles
            yearsPassed++; //increment the years passed
        }
        System.out.println(yearsPassed);
    }
}
