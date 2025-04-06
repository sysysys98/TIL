import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 조합03_재귀함수_반복문 {
	static String[] 재료; // data
	static String[] sel; // 햄버거를 만드는 재료
	static int N, R; // N : 전체 재료의수, R 내가 뽑을 재료의 수

	static List<String[]> result;
	
	public static void main(String[] args) {
		N = 4;
		R = 2;
		재료 = new String[] { "상추", "패티", "토마토", "치즈" };
		sel = new String[R];
		
		result = new ArrayList<>();

		comb(0, 0);
		
//		for(String[] arr : result) {
//			System.out.println(Arrays.toString(arr));
//		}
		
	}// main
	
	// idx : 내가 이번에 고려할 재료들의 인덱스
	// sidx : 뽑은 재료의 인덱스
	public static void comb(int idx, int sidx) {
		//종료조건
		if(sidx == R) {
			System.out.println(Arrays.toString(sel));
//			result.add(sel);
			return;
		}
		//재귀조건
		//범위를 정해놓고 호출 할것!
		for(int i = idx;i <= N-R+sidx; i++) {
			sel[sidx] = 재료[i];
			comb(i+1, sidx+1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
