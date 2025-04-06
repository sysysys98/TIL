
//간선을 전부 계속 순회 하면서 완화시킨다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 그래프최소비용06_벨만포드 {
	static class Edge {
		int s, e, cost;

		public Edge(int s, int e, int cost) {
			this.s = s;
			this.e = e;
			this.cost = cost;
		}
	}

	static int[] dist;
	static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(input2);

		int V = sc.nextInt(); // 시작정점은 0번 부터
		int E = sc.nextInt();
		List<Edge> edges = new ArrayList<>();
		dist = new int[V];
		for (int i = 0; i < E; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int cost = sc.nextInt();

			edges.add(new Edge(s, e, cost));

		} // 간선을 입력 받자

		bellmanFord(V, 0, edges);
	}

	// V : 전체 정점의 개수
	// start : 시작정점
	// edges : 간선의 배열
	static void bellmanFord(int V, int start, List<Edge> edges) {
		// dist 배열 초기화
		Arrays.fill(dist, INF);
		dist[start] = 0; // 시작점만 0으로 바꾼다.

		// 1. 모든 간선을 (V-1)번 반복 -> Relaxation 작업 수행
		for (int i = 0; i < V - 1; i++) {
			boolean flag = false;
			for (Edge edge : edges) {
				// 갱신 : 출발점이 무한대가 아닌 애들만
				if (dist[edge.s] != INF && dist[edge.s] + edge.cost < dist[edge.e]) {
					dist[edge.e] = dist[edge.s] + edge.cost;
					flag = true;
				}
			}
			//사이클 1회 끝
			if(!flag) break; //조기 종료하겠다. (갱신이 일어나지 않았어)
			
			
			
			
			
		}//완화작업 끝
		
		// 2. 음수 사이클 쳌
		boolean negativeCycle = false;
		for(Edge edge : edges) {
			if(dist[edge.s] != INF && dist[edge.s]+ edge.cost < dist[edge.e] ) {
				//조건문이 만족한다... 라면
				//음의 사이클이 존재한다.
				negativeCycle = true;
			}
		}
		
		//3. 결과 확인
		if(negativeCycle) 
			System.out.println("음의 사이클");
		else
			System.out.println(Arrays.toString(dist));
		
		

	}

	static String input1 = "6 7\r\n"  + "0 2 5\r\n" + "1 3 -2\r\n" + "2 4 8\r\n" + "3 5 7\r\n"
			+ "4 2 -3\r\n" + "4 5 6\r\n" + "0 1 4\r\n"+ "";

	static String input2 = "4 4\r\n" + "0 1 5\r\n" + "1 2 -8\r\n" + "2 1 3\r\n" + "2 3 6\r\n" + "";
}
