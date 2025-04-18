import java.io.*;
import java.util.*;

public class HourglassTriangle {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int space = 0;
		int cnt = -2;
		int tmp = 0;
		int num = 1;
		int digit = 1;
		int maxDigit = 1;
		if (n>5) {
			maxDigit = 2;
		}
		
		for (int i=n; i>0; i += cnt) {
			if (i != n) {
				for(int j=space; j>0; j--) {
					sb.append(' ');
				}
			}
			if(cnt < 0 ) {				
				space++;
				if (space == n/2+1) {
					cnt = 2;
					tmp++;
					space -= 2;
				}
			} else {
				space--;
			}
			for(int j=0; j<i; j++) {
//				sb.append("*");
				sb.append(num);
				if (tmp == 0) {
					num++;
				} else {
					num--;
				}
				if (num >= 10 * Math.pow(digit+1, 10)) {
					digit++;
				}

				for (int k=0; k<digit; k++) {
					sb.append(" ");
				}
				
			}
			if (i==n && n > 5) {
				for(int j=maxDigit; j>0; j--) {
					sb.append(' ');
				}
			}
			
			
			if (tmp == 1 && i == n) {
				break;
			}
			sb.append("\n");
			
//7 19
			
		}
		
		
		System.out.println(sb);
		sc.close();
	}
}

//10의 n제곱 이상이면
//n만큼의 띄어쓰기를 뒤에 추가
//
//1 2 3
//  4
//3 2 1

//12345
//678
// 9
//876
//54321
//n의 2배
