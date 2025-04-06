
public class 순열01_반복문 {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3 };
		int N = nums.length;

		// 반복문을 이용하여 구현(원소의 수만큼 중첩)
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j) {
					for (int k = 0; k < N; k++) {
						if (i != k && j != k) {
							System.out.printf("%d %d %d\n", nums[i], nums[j], nums[k]);
						}
					} // [2]
				}
			} // [1]
		} // [0]
	}
}
