//최대힙 기준

import java.util.Arrays;

public class Heap01_Array구현 {
	static int[] heap;
	static int heapSize;

	public static void main(String[] args) {
		// 문제
		heap = new int[100]; // 실제 문제의 입력을 보고 판단
		heapSize = 0;
		
		System.out.println(Arrays.toString(heap));
		heapPush(10);
		System.out.println(Arrays.toString(heap));
		heapPush(20);
		System.out.println(Arrays.toString(heap));
		heapPush(15);
		System.out.println(Arrays.toString(heap));
		heapPush(19);
		System.out.println(Arrays.toString(heap));
		
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
	}

	// 힙 자료형에 맞게 아이템이 들어온다.
	public static void heapPush(int item) {
//		heapSize += 1;
//		heap[heapSize] = item; //마지막 자리에 삽입

		heap[++heapSize] = item;

		int ch = heapSize;
		int p = ch / 2; // 버림이 필요한데... 정수형이라 버려짐

		// 올릴수 있으면 올라가~~
		while (p > 0 && heap[p] < heap[ch]) {
			// swap
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;

			ch = p;
			p = ch / 2;
		}
	}//heapPush
	
	public static int heapPop() {
		//힙이 공백이면 안해~~
		if(heapSize == 0) {
			return -1; //이또한 불안할지도? 주어지는 값이 어디범위지를 보고 판단
		}
		
		int item = heap[1]; //루트노드의 값을 저장해놓았다
		//막내를 수장의 자리에 올려놓는다.
//		heap[1] = heap[heapSize];
//		heapSize -= 1;
		
		heap[1] = heap[heapSize--];
		int p = 1;
		int ch = p * 2; //왼자 세팅
		if(ch+1 <= heapSize && heap[ch] < heap[ch+1])
			ch+=1; //오자로 교환
		
		//내려갈수 있으면 내려가
		while(ch <= heapSize && heap[p] < heap[ch]) {
			int tmp = heap[p];
			heap[p] = heap[ch];
			heap[ch] = tmp;
			
			p = ch;
			ch = p * 2; //왼자세팅
			if(ch+1 <= heapSize && heap[ch] < heap[ch+1])
				ch+=1; //오자로 교환
		}
		
		return item;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
