
class MyQueue {
	
}
public class Queue01_선형큐 {
	public static int[] queue = new int[10];
//	public static int front = -1; //데이터 삭제 위치
//	public static int rear = -1;  //데이터 삽입 위치
	public static int front = -1, rear = -1;
	
	public static void main(String[] args) {
		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);
	
		
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
	}
	
	//삽입
	public static void enQueue(int item) {
		//포화 검사
		if(isFull()) {
			System.out.println("미안해~~ 나 꽉 차있어서 못넣어!");
		}else {
			//서울12강건님이 좋아하는 방식
			queue[++rear] = item;
		}
	}
	//삭제(반환 타입은 필요한가?)
	public static int deQueue() {
		//공백 검사를 하겠다
		if(isEmpty()) {
			System.out.println("꺼낼 값이 없습니다.");
			return -1; //이렇게 쓰는거 괜찮나?(문제의 범위를 보고 구분할 수 있는 값으로 결정)
		}
		return queue[++front];
	}
	
	
	
	
	
	
	//공백
	public static boolean isEmpty() {
		return front == rear;
	}
	
	//포화(배열이라서 한다!)
	public static boolean isFull() {
		return rear == queue.length-1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
