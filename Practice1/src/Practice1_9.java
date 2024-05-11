import java.util.ArrayList;
import java.util.Scanner;

public class Practice1_9 {

    public String solution(String s){
        String answer="No";
        s=s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp=new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }
    
    public static void main(String[] args){
        Practice1_9 T = new Practice1_9();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}