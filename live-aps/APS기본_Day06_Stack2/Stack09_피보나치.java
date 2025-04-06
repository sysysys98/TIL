import java.util.Arrays;

public class Stack09_피보나치 {
	static int[] count = new int[100];
	public static void main(String[] args) {
//		System.out.println(fibo(49));
//		System.out.println(Arrays.toString(count));
	
		System.out.println(fibo2(49));
	}

	//나는 나의 이전과, 이이전을 더해서 만듭니다요
	public static int fibo(int n) {
		count[n]++;
//		if(n == 0) return 0;
//		if(n == 1) return 1;
		if (n < 2)
			return n;
		
		return fibo(n-1)+fibo(n-2);
	}
	
	static int[] memo = new int[50];
	static {
		for(int i = 0 ; i<memo.length;i++) {
			memo[i] = -1;
		}
		
		Arrays.fill(memo, -1);
		
		
		memo[0] = 0;
		memo[1] = 1;
	}
	
	public static int fibo2(int n) {
		if(memo[n] == -1) {
			memo[n] = fibo2(n-1)+fibo2(n-2);
		}
//		if(n >= 2 && memo[n] ==0) {
//			memo[n] = fibo2(n-1)+fibo2(n-2);
//		}
		return memo[n];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
