//클래스로 빼서 만들어도 좋다! -> 추후에 해보세요~~

import java.util.Arrays;

class MyStack<E> {

}

//static 만들겠다! -> 결정
public class Stack02_배열구현 {
	// 배열을 이용해서 만든다! (계산 하기 싫으면 10만~100만사이 정도 크기)
	static String[] stack = new String[10];
	static int top = -1; // -1은 스택이 공백상태!

	public static void main(String[] args) {
		push("짜장면");
		push("탕수육");
		push("수제비");
		System.out.println(pop());
		push("김치전");

		System.out.println(Arrays.toString(stack));
	}

	// 삽입(Push)
	static boolean push(String value) {
		// 배열이니까....
		if (isFull()) {
			System.out.println("가득 차있어.... 미안해");
			// 여기에서든 full에서든 우리가 만드는 커스텀이니
			// 배열의 크기를 두배로 늘려서 다시 복사해도 좋아요~~
			return false;
		}
		stack[++top] = value;
		return true;
	}
	// 삭제(Pop)
	static String pop() {
		if(isEmpty()) {
			System.out.println("뺄 것이 없어 미안해~~");
			return null;
		}
		
		return stack[top--];
	}
	
	
	
	
	// 조회(Peek)
	static String peek() {
		if(isEmpty()) {
			System.out.println("공백인데?");
			return null;
		}
		return stack[top];
	}

	// 공백(Empty)
	static boolean isEmpty() {
//		if(top == -1)
//			return true;
//		else
//			return false;

//		if (top == -1)
//			return true;
//		return false;

		return top == -1;
	}

	// 포화(Full) : 배열이라서...
	static boolean isFull() {
		return top == stack.length - 1;
	}

}
