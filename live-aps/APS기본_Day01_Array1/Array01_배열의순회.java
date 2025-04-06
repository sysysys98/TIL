
public class Array01_배열의순회 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6 };
		int N = arr.length;

		System.out.println("정방향 순회");
		// 1. 정방향으로 순회를 해보자~~
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("역방향 순회");
		// 2-1. 역방향인데 반복문의 조건을 건드리자!
		for (int i = N - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 2-2. 역방향인데 조건보다는 인덱스를 건드리자!
		for (int i = 0; i < N; i++) {
			System.out.print(arr[N - 1 - i] + " ");
		}
		System.out.println();
		
		//특정한 인덱스를 기준으로 양쪽으로 퍼지는 순회를 할 수 있는가
		//코드로 직접 작성해볼것!
//		왼			  오
//		0 1 2 [3] 4 5 6
//		
//		왼			  오
//		0 1 [2] 3 4 5 6
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
