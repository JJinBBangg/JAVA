package ch14.sec05.exam02;

public class JoinExmaple {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1~100 합 : " + sumThread.getSum());
	}
}
