import java .util.*;

public class BeautifulYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        while(true){
            year++;
            String s = Integer.toString(year);
            Set<Character> set = new HashSet<>(); // to store unique characters
            for(int i = 0 ; i < s.length() ; i++){
                set.add(s.charAt(i));
            }
            if(set.size() == s.length()){ // size = unique characters // length = total characters
                System.out.println(year);
                break;
            }
        }
    }
}
