import java.util.Stack;

public class Stack01_API {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
//		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		//스택에 있는 모든 자료를 전부다 출력하고 싶어!
		//pop()을 반복할거야! for문을 완벽하게 내것으로 만들면 약간의 수정으로도 가능
		for(int i = 0 ; i<stack.size(); i++) {
			System.out.println(stack.pop());
		}//올바르지 못해!
		
		//1. size 변수 저장
		int size = stack.size();
		
		//2. while 문을 이용하자
		while(!stack.isEmpty()) {
			
		}
		
		
		System.out.println(stack.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
