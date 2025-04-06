import java.util.Arrays;

public class Array03_버블정렬 {
	//정적변수로 선언하게 되면 함수에서 파라미터를 줄일 수도 있다.
	static int[] arr;
	public static void main(String[] args) {
		arr = new int[]{ 55, 7, 78, 12, 42 };

		bubbleSort();
		
		//내가 내림차순은 도무지 할줄 모르겠다. 오로지 오름차순!
		//그런데 문제에서는 내림차순을 원해!
//		for(int i = arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}
		
		System.out.println(Arrays.toString(arr));

	}
	
	public static void bubbleSort() {
		int N = arr.length;
		
		// 버블정렬(구현 방법 중 1가지)
		//i : 각 사이클에서 최대 데이터가 정렬될 위치
		for (int i = N - 1; i > 0; i--) {
			//j : 인접 위치와 비교할 친구
			for (int j = 0; j < i; j++) {
				//오름차순 정렬
				if(arr[j] > arr[j+1]) {
					//교환
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
//			System.out.println("사이클 수행");
//			System.out.println(Arrays.toString(arr));
			
		}
//		return;
	}
}
