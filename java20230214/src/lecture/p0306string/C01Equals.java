package lecture.p0306string;

public class C01Equals {
	public static void main(String[] args) {
		// equals
		// 두 문자열이 같은 지 확인하는 메소드
		// return type : boolean
		
		String a = "java";
		String b = "ja";
		String c = "va";
		
		boolean res1 = a == (b + c);
		System.out.println(res1);
		
		boolean res2 = a.equals(b + c);
		System.out.println(res1);
		
	}
}
