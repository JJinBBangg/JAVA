package lecture.p0606final;

public class C01Final {
	public static void main(String[] args) {
		//final : 값을 한번만 할당할 수 있음(상수)
		int a = 3;
		a = 5;
		final int b = 5;
//		b = 10; // XX
		
	}
	public void method1(int i) {
		System.out.println(i);
		i = 5;
		System.out.println(i);
	}
	static void method2(final int i) {
		System.out.println(i);
//		i = 5; // 변경할 수 없음
		System.out.println(i);
	}
}
