
public class 부분집합02_비트마스킹 {
	static String[] 재료 = { "단무지", "햄", "오이", "계란" };
	static int N = 4;

	public static void main(String[] args) {

//		for(int i = 0; i<Math.pow(2, N); i++) {
		for (int i = 0; i < (1 <<N ) ; i++) {
			System.out.print("김밥 : ");
			//서울9반 이솔빈 훌륭 그자체
			for(int j = 0; j < N; j++) {
				//재료를 하나씩 쉬프트 하면서 검사할껀데 1이냐로 쳌 하면 안됨.
				if((i & (1<<j)) != 0) {
					//해당 코드가 실행이 된다!
					System.out.print(재료[j]);
				}
			}//재료 쳌
			System.out.println();
		} // 모든 김밥의 경우의 수
	}
}
