package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * 문제 : 
		 * str = "abcdefghijk"
		 * 
		 * 출력
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 * 
		 */
		
		String str = "abcdefghijk";
	
		for(int i = 0; i < str.length(); i++) {
		String a = str.substring(i, i +  1);
		System.out.println(a);
	}		
		
		
//		str.length() -> str의 길이
		
		
		
		
//		방법2
//		for(int i = 0; i < 11; i++) {
//			System.out.println(str.substring(i, i + 1));
//		}	
		
	}

}
