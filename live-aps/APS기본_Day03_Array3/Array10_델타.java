
public class Array10_델타 {
	// static 을 통해 델타를 선언을 많이함!
	public static void main(String[] args) {
		// 상하좌우
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		int[][] arr = new int[3][3];
		int N = arr.length;
		int r = 2;
		int c = 1;

		for (int d = 0; d < 4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			//좌표값 할당은 OK
			//2가지 방식
			//1. 내 안에 들어오면 할래!
//			if(nr >= 0 && nr < N && nc >=0 && nc <N) {
//				System.out.println(arr[nr][nc]);
//			}
			//2. 내 밖이야? 그럼 안해~
			if(nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
			System.out.println(arr[nr][nc]);
		} // 4방향을 보기 위함

	}
}
