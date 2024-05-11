import java.util.ArrayList;
import java.util.Scanner;

public class Practice1_8 {

    public String solution(String str){
        String answer="No";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }
    
    public static void main(String[] args){
        Practice1_8 T = new Practice1_8();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}