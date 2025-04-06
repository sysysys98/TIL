import java.util.Arrays;

public class String02_회문 {
	public static void main(String[] args) {
		String str = "다시합창합시다!";
		int N = str.length();
		
		//1. 뒤집기 (반복문)
		char[] arr1 = new char[N];
		for(int i=0; i<N; i++) {
			arr1[i] = str.charAt(N-1-i); 
		}
		System.out.println(Arrays.toString(arr1));
		
		//2. StringBuilder 
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse().toString());
		
		
		//3. swap
		char[] arr2 = str.toCharArray();
		
		for(int i =0 ; i<N/2; i++) {
			//swap 
			char tmp = arr2[i];
			arr2[i] = arr2[N-1-i];
			arr2[N-1-i] = tmp;
		}
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
	}
}
