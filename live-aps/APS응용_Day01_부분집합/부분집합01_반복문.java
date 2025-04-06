import java.util.Arrays;

public class 부분집합01_반복문 {
	static String[] 재료 = { "단무지", "햄", "오이", "계란" };
	static int N = 4;
	// 해당 재료를 사용했는지 유무 썼니? 안썼니? boolean[]
	static int[] sel = new int[N]; // {0,0,0,0}

	public static void main(String[] args) {
		// 반복문 : 재료의 개수만큼 4중 포문
		for (int i = 0; i <= 1; i++) {
			sel[0] = i;
			for (int j = 0; j <= 1; j++) {
				sel[1] = j;
				for (int k = 0; k <= 1; k++) {
					sel[2] = k;
					for (int l = 0; l <= 1; l++) {
						sel[3] = l;
						System.out.println(Arrays.toString(sel));
//						for(int a = 0; a < N; a++) {
//							if(sel[a] == 1) {
//								System.out.print(재료[a]);
//							}
//						}
//						System.out.println(" 김밥");
						
						
					} // 계란(전지환님을 위한 반복문)
				} // 오이
			} // 햄
		} // 단무지

	}
}
