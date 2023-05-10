package exercise2;

public class MyThread extends Thread {
	private int[] arr;
	private int sum = 0;

	public MyThread(int[] arr) {
		setArr(arr);
	}

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
		for (int i = 0; i < 4; i++) {
			sum += arr[i];
		}
	}

}
