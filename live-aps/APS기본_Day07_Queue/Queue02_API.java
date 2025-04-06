import java.util.LinkedList;
import java.util.Queue;

public class Queue02_API {
	public static void main(String[] args) {
		//인터페이스
		Queue<Integer> queue = new LinkedList<>();
		
		//추가
//		queue.add(1);
//		queue.offer(2);
		
		//삭제
//		queue.remove();
		System.out.println(queue.poll());
		
		//조회
//		queue.element();
//		queue.peek();
		
		//윗줄 삼총사 add, remove, element -> 예외발생
		//아랫줄 삼총사 offer, poll, peek -> 값을 리턴
		
		
		
		
		
		
		
	}
}
