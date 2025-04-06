import java.util.Arrays;

public class Array07_카운팅정렬 {
	public static void main(String[] args) {
		int[] arr = { 3, 13, 26, 88, 22, 11, 54, 12 };

		int[] sArr = countingSort(arr);
		
		System.out.println(Arrays.toString(sArr));

	}

	static int[] countingSort(int[] arr) {
		// 1. 가장 큰 값을 찾는다. (문제에 따라서 음수가 나오는경우 작은 값도 찾아야 함)
		int K = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > K)
				K = arr[i];
		} // 가장 큰값 찾기

		// 2. Count 하기!
		int[] count = new int[K + 1];
		for (int i = 0; i < arr.length; i++) {
//			int idx = arr[i];
//			count[idx]++;
			count[arr[i]]++;
		}

		// 3. 누적합 구하기(해당 원소가 어디 위치에 있어야 하는지를 결정!)
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1]; // count[i] = count[i] + count[i-1];
		}

		// 4. 역방향으로 순회하면서... (안정정렬)
		int[] sortArr = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
//			int num = arr[i];
//			int idx = count[num]-1;
//			sortArr[idx] = num; //arr[i]
//			count[num]--;

			// 최종형태 위를 익히고 나서 그 다음에 오자!
			sortArr[--count[arr[i]]] = arr[i];
		}
		
		return sortArr;

	}
}
