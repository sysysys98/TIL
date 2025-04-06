import java.util.Arrays;
import java.util.Scanner;

public class 그래프최소비용07_플로이드워셜 {
	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(input1);

		int V = sc.nextInt(); // 정점의 개수 (시작정점의 번호 확인)
		int E = sc.nextInt(); // 간선의 개수

		int[][] dist = new int[V][V]; // 0번부터 하더라.
		//나 자신은 0으로 그 외 나머지는 전부 INF
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < V; j++) {
				if (i != j)
					dist[i][j] = INF;
			}
		}
		
		//입력 받아서 연결된 간선 정보 등록
		for(int i = 0 ; i<E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();
			
			dist[s][e] = cost; //지금은 유향
		}
		//플로이드워셜
		for(int k = 0; k<V; k++) {
			for(int i = 0 ; i<V; i++) {
				//i의 출발지에서 경유지 k까지 거리가 무한대!
				if(dist[i][k] == INF) continue;
				for(int j = 0 ; j<V; j++) {
					//경유지 k로부터 도착지 j까지 무한대라면 할 필요 없음
					if(dist[k][j] == INF) continue;
					dist[i][j] = Math.min(dist[i][j], dist[i][k]+dist[k][j]);
				}//도착점
			}//출발점
		}//경유지
		
		//옵션) 음수 사이클 검사
		boolean negativeCycle = false;
		for(int i = 0 ; i<V; i++	) {
			if(dist[i][i] < 0) {
				negativeCycle = true;
				break;
			}
		}
		
		if(negativeCycle)
			System.out.println("음의 사이클 존재");
		else {
			for(int i = 0; i<V; i++) {
				System.out.println(Arrays.toString(dist[i]));
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}// main

	
	
	
	
	
	
	
	
	
	
	
	static String input1 = "5 9\r\n" + "0 1 3\r\n" + "0 2 8\r\n" + "0 4 -4\r\n" + "1 3 1\r\n" + "1 4 7\r\n"
			+ "2 1 4\r\n" + "3 0 2\r\n" + "3 2 -5\r\n" + "4 3 6\r\n" + "";
	static String input2 = "4 5\r\n" + "0 1 1\r\n" + "0 3 4\r\n" + "1 2 1\r\n" + "2 0 -3\r\n" + "3 2 2\r\n" + "";
}
