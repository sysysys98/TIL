import java.util.Arrays;
import java.util.Scanner;

public class Array02_스캐너 {
	public static void main(String[] args) {
		// 국룰
		Scanner sc = new Scanner(System.in);
		// 보통 SWEA 문제 -> 테스트케이스 수를 주고 / 이 후 돌림

		int T = sc.nextInt(); // 테스트케이스 수를 입력받는다.
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;

			int N = sc.nextInt(); // 7
			int[] arr = new int[N]; // 크기가 N개인 배열이 생성되었음 값은 0으로 초기화

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt(); // 1 3 4 2 0 3 5
										// 1342035 붙어있다!(고민해보시오)
			}
			System.out.println(Arrays.toString(arr));

			// 정답 출력 #tc ans
			System.out.println("#" + tc + " " + ans);
		} // tc 반복문
	}// main
}
