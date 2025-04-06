
public class Array09_달팽이순회 {
	//해결방법은 엄청나게 많다!
	public static void main(String[] args) {
		int N = 4;
		int[][] arr = new int[N][N];
		
		int K = N; //K만큼 길이를 이동할거야!
		int dir = 1; //증감을 위한 친구 -> 1 / -1 
		int r = 0;
		int c = -1;
		int num = 1;
		
		while(true) {
			//수평 -> 수직
			for(int i = 0 ; i< K; i++) {
				c += dir;
				arr[r][c] = num++;
			}
			K--;
			//종료조건!
			//num == N*N
			//K == 0 
			//(r,c) == (중앙좌표)일때
			if(K==0) break;
			
			//수직->수평
			for(int i = 0 ; i<K; i++) {
				r += dir;
				arr[r][c] = num++;
			}
			dir = -dir;
		}//무한루프
		
		for(int i = 0 ; i< N; i++) {
			for(int j = 0; j<N ;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
