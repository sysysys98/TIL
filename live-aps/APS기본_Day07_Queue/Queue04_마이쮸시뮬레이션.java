import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue04_마이쮸시뮬레이션 {
	static class Person {
		int num;
		int cnt;

		public Person(int num, int cnt) {
			this.num = num;
			this.cnt = cnt;
		}

		@Override
		public String toString() {
			return "Person [num=" + num + ", cnt=" + cnt + "]";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;
			int N = sc.nextInt();
			int pNum = 1;

			// [0] : 학생 번호 / [1] : 받을 마이쮸 개수
//			Queue<int[]> queue = new LinkedList<>();
			Queue<Person> queue = new LinkedList<>();

			queue.add(new Person(pNum++, 1));
			while (N > 0) {
				Person p = queue.poll();
				N -= p.cnt; // 줬어 ㅠ
				if (N <= 0) {
					// 고만훼
					ans = p.num;
					break;
				} else {
					// p는 재빠르게 가서 다시 줄을 선다!
					p.cnt++;
					queue.add(p);
					// 다음 번호의 사람이 와서 줄을 선다!
					queue.add(new Person(pNum++, 1));
				}
			}
			// 정답 출력 "#tc ans"
			System.out.println("#" + tc + " " + ans);
		} // tc
	}// main
}
