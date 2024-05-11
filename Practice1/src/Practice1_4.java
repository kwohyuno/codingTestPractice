import java.util.Scanner;

public class Practice1_4 {

    public String solution(String str){
        String answer=""; 
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        return answer;

    }
    
    public static void main(String[] args) throws Exception {
        Practice1_4 T = new Practice1_4();
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); 
        System.out.print(T.solution(str));
    }




}

// A=65~90   a=97~122  를 이용해 aski 로 풀 수도 있다 