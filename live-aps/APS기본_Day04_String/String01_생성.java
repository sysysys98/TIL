import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class String01_생성 {
	public static void main(String[] args) {
		//1. 리터럴 사용 -> String Pool
		String str1 = "Hello";
		String str2 = "Hello"; 
		//str1 str2는 같아요! 똑같은 친구를 가리키고 있다!
		System.out.println(str1 == str2);
		
		
		//2. 힙에 생성
		String str3 = new String("Hello");
		//str1 str3는 달라요!
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		
		byte[] bytes = {65, 66, 67};
		String str4 = new String(bytes, StandardCharsets.UTF_8);
		System.out.println(str4);
		
		//문자열은 불변성을 가지고 있다!
		//문자열에서 문자를 하나씩 뜯어오고 싶다!
		//문자열을 char[] 형태로 만들려면!!
		char[] arr1 = new char[str1.length()];
		for(int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
			arr1[i] = str1.charAt(i);
		}
		System.out.println(Arrays.toString(arr1));
		
		//조금 더 편하게 만들수 없나
		char[] arr2 = str1.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//Java에서 문자한개를 입력 받는 방법
		//없어요!
//		문자열로 받아서 charAt(0) 해야함
		//sc.next().charAt(0) 이런식으로 문자 한개씩 받을 수 있다.
		
		//contains : 문자열 안에 해당 인자를 포함하고 있는지 쳌
		System.out.println(str1.contains("l"));
		
		//split : 구분자를 이용하여 문자열 배열을 반환!
//		String[] numbers = "one,two,three".split(",");
		String[] numbers = "one two three".split(" ");
		System.out.println(Arrays.toString(numbers));
		
		//beginIndex(실제시작위치, endIndex(작성한 이전위치까지) 
		str1.substring(0, 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
