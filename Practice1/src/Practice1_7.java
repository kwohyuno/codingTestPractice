import java.util.ArrayList;
import java.util.Scanner;

public class Practice1_7 {

    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s=x.toCharArray(); 
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);

        }

        return answer;
    }
    
    public static void main(String[] args){
        Practice1_7 T = new Practice1_7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x: T.solution(n,str)){
            System.out.println(x);
        }
    }
}