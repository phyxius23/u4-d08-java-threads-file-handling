package exercise1;

public class MyThread extends Thread {

	// Attributi
	private String color;

	// Costruttore
	public MyThread(String c) {
		this.color = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(color + this.getName() + ": " + (i + 1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
