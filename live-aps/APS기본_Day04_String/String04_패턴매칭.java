
public class String04_패턴매칭 {
	public static void main(String[] args) {
		String text = "This iss a book";
		String p = "iss";
		System.out.println(matchingFor(text, p));
	}
	
	static int matchingFor(String t, String p) {
		//for문을 이용하여 만들 수 있는가!
		int N = t.length();
		int M = p.length();
		
		for(int i = 0; i<N-M+1; i++) {
			boolean isOk = true;
			for(int j = 0 ; j<M; j++) {
				if(t.charAt(i+j) != p.charAt(j)) {
					isOk = false;
					break;
				}
			}//패턴을 위한
			if(isOk) return i;
		}//시작점을 위한
		
		
		return -1;
	}
	
	static int matchingWhile(String t, String p) {
		return -1;
	}
}
