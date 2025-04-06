import java.util.Arrays;

public class Array04_순차검색 {
	public static void main(String[] args) {
		int[] arr = { 4, 9, 11, 23, 2, 19, 7 }; // 정렬X
		int N = arr.length;
		int key = 8;
		// 원래는 스캐너를 통해서 입력 받는다!

		System.out.println(searchWhileNoSort(arr, key, N));
		
		Arrays.sort(arr);
		//arr 은 정렬O
		
		
		
		
	}
	
	static int searchForNoSort(int[] arr, int key, int N) {
		//마음의 과제 
		return -1;
	}
	
	
	static int searchWhileNoSort(int[] arr, int key, int N) {
		int i = 0;
		while (i < N) {
			if(arr[i] == key)
				return i;
			i++;
		}
		return -1;
		
//		int i = 0;
//		while (i < N && arr[i] != key) {
//			i++;
//		}
//		if (i < N)
//			return i;
//		return -1;
	}
	
	
	static int searchForSort(int[] arr, int key, int N) {
		for(int i = 0; i < N; i++) {
			if(arr[i] == key) return i;
			//내가 보고있는 값이 찾고자 하는 값보다 더크면 
			//뒤에 나올리가 없다 그만훼~~
			else if(arr[i] > key) break;
		}
		return -1;
	}
	
	static int searchWhileSort(int[] arr, int key, int N) {
		//마음의 과제
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
