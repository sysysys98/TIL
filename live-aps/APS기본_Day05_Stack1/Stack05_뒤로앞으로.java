import java.util.Scanner;
import java.util.Stack;

public class Stack05_뒤로앞으로 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 스택 2개! (한글 변수는 권장x)
		Stack<String> 뒤로 = new Stack<>();
		Stack<String> 앞으로 = new Stack<>();

		// 학생관리 -> do while

		String page = "구글";

		while (true) {
			System.out.println("1. 새로운 페이지 방문(주소입력, 파비콘 클릭)");
			System.out.println("2. 뒤로가기 클릭");
			System.out.println("3. 앞으로가기 클릭");
			System.out.println("0. 종료(1,2,3을 제외한 어떠한 입력도 OK)");

			// 선택 메뉴
			int N = sc.nextInt();
			switch (N) {
			case 1:
				// 새로운 페이지 방문
				// 1. 현재 페이지를 뒤로 스택에 넣는다.
				뒤로.push(page);
				// 2. 새로운 페이지를 입력받자
				page = sc.next(); // 페이지 이름에 공백은 없다
				// 3. 앞으로 스택을 비워야된다.
				// 3-1. while, for문을 이용하여 공백상태가 될때까지 뽑는다.
				// 3-2. 새로운 스택을 생성한다(new 인스턴스 생성)
				// 3-3. clear() 메서드를 활용하여 비워버린다.
				앞으로.clear();
				// 4. 현재페이지 출력(선택)
				System.out.println("현재페이지 : " + page);
				break;
			case 2:
				if (뒤로.isEmpty()) {
					System.out.println("사실 버튼 비활성화라서 누를 수는 없었음");
				} else {
					// 뒤로가기 기능
					// 1. 현재 페이지를 앞으로 스택에 넣는다.
					앞으로.push(page);
					// 2. 현재 페이지는 뒤로 가기에서 꺼내온다.
					page = 뒤로.pop();
					// 3. 출력한다.
					System.out.println("현재페이지 : " + page);
				}
				break;
			case 3:
				// 앞으로 가기 기능
				if (앞으로.isEmpty()) {
					System.out.println("비활성화 되어있는 상태, 내가 최신이라 앞으로 갈게 없음");
				} else {
					// 1.현재 페이지를 뒤로 스택에 넣는다.
					뒤로.push(page);
					// 2. 앞으로 스택에서 꺼내어 현재 페이지에 넣는다.
					page = 앞으로.pop();
					// 3. 출력한다.
					System.out.println("현재페이지 : " + page);
				}
				break;
			default:
				System.out.println("종료합니다.");
				return;
			}

		}

	}
}
