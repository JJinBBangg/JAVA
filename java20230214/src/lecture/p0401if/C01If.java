package lecture.p0401if;

public class C01If {
	public static void main(String[] args) {
		// if : 조건문(분기문)
		
		System.out.println("이전실행문");
		
		if (false) {
			System.out.println("실행문1");
		}
		
		System.out.println("실행문2");
		
		// if 코드 블럭의 명령문이 하나면 {}생략가능
		// 하지만 생략하지 말 것(가독성떨어짐)
		if(true)
			System.out.println("실행문3");
		
		System.out.println("실행문4");
	
	}
}
