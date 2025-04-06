import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack06_계산기 {
	public static void main(String[] args) {
		//원래 같았으면 입력을 받을거야!
		String infix = "(6+5*(2-8)/2)";
		
		//연산자 우선 순위!
		// ( : 겉바속촉
		// +, - : 동급 1
		// *, / : 동급 2
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('(', 0);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 2);
		
		
		
		StringBuilder postfix = new StringBuilder();
		
		//연산자를 담는 스택
		Stack<Character> op = new Stack<>();
		
		
		for(int i = 0 ; i<infix.length(); i++) {
			// '('
			if(infix.charAt(i) == '(') {
				//우선순위는 겉바! 그냥 냅다 추가
				op.push(infix.charAt(i));
			}
			// ')'
			else if(infix.charAt(i) == ')') {
				//여는 괄호를 만날때까지 꺼내고, 버린다.
				while(op.peek() != '(') {
					postfix.append(op.pop());
				}
				op.pop(); //top이 가리키는 여는 소괄호 버리기
			}
			// 피연산자(한자리 라고 가정)
			else if(infix.charAt(i) >= '0' && infix.charAt(i)<='9') {
				postfix.append(infix.charAt(i));
			}
			// 연산자
			else {
				//공백O
				if(op.isEmpty())
					op.push(infix.charAt(i));
				//공백X
				else {
					//연산자 우선순위를 비교해서 처리(작성해보기)
					while(priority.get(op.peek()) >= priority.get(infix.charAt(i)) && !op.isEmpty()) {
						postfix.append(op.pop());
					}
					op.push(infix.charAt(i));
				}
			}
		}//중위표기를 하나씩 읽어서 처리
		
		//남은거 다털어!
		while(!op.isEmpty()) {
			postfix.append(op.pop());
		}
		System.out.println(postfix);
		/////////////////////////////////////////계산
		Stack<Integer> calc = new Stack<>(); //숫자를 담을 스택
		for(int i = 0; i<postfix.length(); i++	) {
			//피연산자라면
			if(postfix.charAt(i) >= '0' && postfix.charAt(i) <= '9') {
				calc.push(postfix.charAt(i)-'0');
			}
			//연산자라면
			else {
				//꺼내는 순서 중요하다.
				int B = calc.pop();
				int A = calc.pop();
				
				switch(postfix.charAt(i)) {
				case '+':
					calc.push(A+B);
					break;
				case '-':
					calc.push(A-B);
					break;
				case '*':
					calc.push(A*B);
					break;
				case '/':
					calc.push(A/B);
					break;
				}
			}
		
		}//후위 계산 for문
		
		System.out.println(calc.pop());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
