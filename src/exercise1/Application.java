package exercise1;

public class Application {

	public static void main(String[] args) {
		MyThread t1 = new MyThread(Colors.ANSI_GREEN);
		MyThread t2 = new MyThread(Colors.ANSI_PURPLE);

		t1.setName("*");
		t2.setName("#");

		t1.start();
		t2.start();
	}

}
