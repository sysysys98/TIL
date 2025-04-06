
public class Array08_2차원배열순회 {
	public static void main(String[] args) {
		//문제를 풀때는 입력을 통해서 채운다.
		//3 4 
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
//		int[][] arr = new int[N][M];
//		for() {
//			
//		}
		int[][] arr = { {1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}};
		
		//정방향으로 행 우선 순회
//		for(int i = 0 ; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}//열을 위한
//			System.out.println();
//		}//행고정
		
//		//역방향으로 행 우선 순회 (조건 건드리기)
//		for(int i = 0 ; i<arr.length; i++) {
//			for(int j = arr[i].length-1; j>=0; j--) {
//				System.out.print(arr[i][j]+" ");
//			}//열을 위한
//			System.out.println();
//		}//행고정
		
//		//역방향으로 행 우선 순회 (인덱스 건드리기)
//		for(int i = 0 ; i<arr.length; i++) {
//			for(int j = 0; j<arr[i].length; j++) {
//				System.out.print(arr[i][arr[i].length-1-j]+" ");
//			}//열을 위한
//			System.out.println();
//		}//행고정
		
		
		//정방향 열우선순회 (가변 배열일때 고민을 해보자!)
		for(int j = 0; j < arr[0].length; j++) {
			for(int i = 0 ; i < arr.length; i++	) {
				System.out.print(arr[i][j]+" ");
			}//행을 위한
			System.out.println();
		}//열 고정
		
		
		//역방향 열우선순회(마음의 과제)
		
		
		//지그재그 방식(마음의 과제)
		
		
		
		
		
		
		
		
		
		
		
	}
}
