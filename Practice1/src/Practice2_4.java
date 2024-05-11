import java.util.*;
class Practice2_4 {	
	public int solution(int n, int[] arr){
		int answer=1, max=arr[0];
		for(int i=1; i<n; i++){
			if(arr[i]>max){
				max=arr[i];
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args){
		Practice2_4 T = new Practice2_4();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}