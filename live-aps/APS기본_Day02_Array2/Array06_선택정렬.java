import java.util.Arrays;

public class Array06_선택정렬 {
	public static void main(String[] args) {
		int[] arr = { 3, 13, 26, 88, 22, 11, 54, 12 };
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	static void selectionSort(int[] arr) {
		// 반복을 돌겠다!
		for (int i = 0; i < arr.length - 1; i++) {
			//가장 작다고 믿는....
			int minIdx = i; //초기화
			//나를 제외하고/정렬된곳도 제외하고 나머지 중 가장 작은 값의 위치를 뽑겠다.
			for(int j = i+1; j<arr.length; j++) {
				if(arr[minIdx] > arr[j])
					minIdx = j;	
			}//가장 작은 값의 위치를 얻어냈다!
			//swap 할꺼야!
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		} // 내가 정렬하고 싶은 자리!
	}
}
