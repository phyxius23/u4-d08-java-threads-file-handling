package exercise2;

public class MyThread extends Thread {

	// Attributi
	private int[] arr;
	private int sum = 0;

	// Costruttore
	public MyThread(int[] arr) {
		setArr(arr);
	}

	// Gettters & Setters
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			sum += arr[i];
		}
	}
}
