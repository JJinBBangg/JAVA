package lecture.p0405break;

public class C02Break {
	public static void main(String[] args) {
		// 4x+5y = 60
		// 해가되는 (x, y)출력

		outerLoop: for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.printf("(%d, %d)%n", x, y);
					break outerLoop;
				}
			}
		}
	}
}
