import java.util.*;

public class Practice1_10 {
    
    public int solution(String s){
        int answer = 0;
        for(char x : s.toCharArray()){
            if(x>=48 && x<=57) answer = answer*10+(x-48);
        }
        return answer;
    }


    public static void main(String[] args){
        Practice1_10 T = new Practice1_10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); 
        System.out.print(T.solution(str));
    }
}
