import java.util.Arrays;

public class 순열03_방문체크 {
	static int[] nums;
	static int N;
	static int[] result; //결과배열
	static boolean[] visited; //방문쳌

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2,};
		N = nums.length;
		
		result = new int[N];
		visited = new boolean[N];
		
		
		perm(0);
	}

	// idx : 내가 채울 위치
	static void perm(int idx) {
		// 기저조건
		if (idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		// 재귀부분
		for (int i = 0; i < N; i++) {
			//사용하지 않은 원소를 사용해야 해!
			//1. 사용했으면 쳐내
			if(visited[i]) continue;
			result[idx] = nums[i];
			visited[i] = true; //사용했어!
			perm(idx+1);
			visited[i] = false; //원상복구
			
			//2. 사용하지 않았으면 해
//			if(!visited[i]) { 코드 작성}
			
			
			
			
			
			
		}

	}
	
}
