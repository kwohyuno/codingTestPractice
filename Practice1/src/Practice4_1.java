import java.util.*;

class Practice4_1 {	
	public int solution(int n, int[] arr){
		int answer=0, cnt=0;
		for(int i=0; i<n; i++){
			if(arr[i]==1){
				cnt++;
				answer+=cnt;
			}
			else cnt=0;
		}	
		return answer;
	}
	public static void main(String[] args){
		Practice4_1 T = new Practice4_1();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}