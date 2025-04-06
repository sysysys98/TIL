//문자열->정수 / 정수-> 문자열
public class String03_atoi_itoa {
	public static void main(String[] args) {
		String strNum = "-123456";
		int num = Integer.parseInt(strNum);
		System.out.println(num);
		
		System.out.println(atoi(strNum));
		
		
		String strNum2 = String.valueOf(num);
		String strNum3 = num+"";
		
	}
	
	//만약에 str 이 음수라면? 실수라면?
	static int atoi(String str) {
		//우리가 직접만들면 저런 상황도 전부 처리가 가능하다. 이상한것도
		int N = str.length();
		int num = 0;
		
		// str :  1, 2, 3, 4, 5, 6
		for(int i = 0; i<N; i++) {
			char c = str.charAt(i);	
			
			//음... 이거 숫자인가?
			if('0' <= c && c <= '9') {
				num = (num*10) + (c-'0');
			}else {
				return Integer.MIN_VALUE;
			}
		}
		return num;
	}
	
	static String itoa(int num) {
		return null;
	}
	
}
