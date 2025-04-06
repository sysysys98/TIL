
public class Stack08_팩토리얼 {
	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fact(13)); //int형으로 처리할 수없어서 이상한 값이나옴
		//팩토리얼
		int result = 1;
		for(int i = 1; i<=12; i++) {
			result *= i;
		}
	}
	
	public static int fact(int n) {
		//기본
		if(n == 0 || n == 1) return 1;
		//재귀
		return n * fact(n-1);
	}
}
