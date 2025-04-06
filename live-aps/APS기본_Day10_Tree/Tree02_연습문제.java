import java.util.Arrays;
import java.util.Scanner;

public class Tree02_연습문제 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);

		int V = sc.nextInt(); // 노드의 총 개수 -> 0번부터 시작하는지 1번부터 시작하는지를 파악
		int[][] tree = new int[V + 1][3]; // [0]왼자, [1]오자, [2]부모
		// V-1만큼 들어온대요!
		for (int i = 0; i < V - 1; i++) {
			int p = sc.nextInt(); // 부모
			int c = sc.nextInt(); // 자식
			// 문제에서 부모의 노드 번호가 작은것부터 준다!
			// 왼쪽 자식부터 준다.

			// 왼자가 아직 채워지지 않았다면....
			if (tree[p][0] == 0) {
				tree[p][0] = c; // 왼자 저장
			} else {
				tree[p][1] = c; // 오자 저장
			}

			// 부모정보 저장
			tree[c][2] = p;

		} // 입력처리
		for (int i = 0; i < V + 1; i++) {
			System.out.println(i+" : "+Arrays.toString(tree[i]));
		}

	}
	
	static String input = "13 \r\n"
			+ "1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13";
	
	
	
	
	
	
	
	
	
}
