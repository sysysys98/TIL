public class Array05_이진검색 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 7, 9, 11, 19, 23 }; // 정렬O
		
		System.out.println(binarySearch(arr, 10));
	}

	static int binarySearch(int[] arr, int key) {
		int L = 0; // 시작점
		int R = arr.length - 1; // 끝점

		// 교차가 되면 멈추겠다!
		while (L <= R) {
			int mid = (L + R) / 2; // 버림 처리가 된다! (0+6)/2 = 3, (0+5)/2 = 2
			if (arr[mid] == key) {// 찾았어!
				return mid;
			} else if (arr[mid] < key) {
				// 가운데가 작아! 오른쪽구간으로 가겠다!
				L = mid + 1;
			} else {
				R = mid - 1;
			}
		}
		return -1;
	}
}
