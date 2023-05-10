package exercise2;

import java.util.Random;

public class Application {

	public static void main(String[] args) {

		int[] bigArray = new int[3000];
		int[] miniArray1 = new int[1000];
		int[] miniArray2 = new int[1000];
		int[] miniArray3 = new int[1000];

		bigArray = generateArray();
		miniArray1 = splitArray(bigArray, 0, 1000);
		miniArray2 = splitArray(bigArray, 1000, 2000);
		miniArray3 = splitArray(bigArray, 2000, 3000);

		MyThread t1 = new MyThread(miniArray1);
		MyThread t2 = new MyThread(miniArray2);
		MyThread t3 = new MyThread(miniArray3);

		int sum = 0;

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sum = t1.getSum() + t2.getSum() + t3.getSum();
		System.out.println("La somma dei tre thread è: " + sum);
	}

	public static int[] generateArray() {
		Random random = new Random();
		int numberRandom;
		int[] arr = new int[3000];

		for (int i = 0; i < 3000; i++) {
			numberRandom = random.nextInt(3000) + 1;
			arr[i] = numberRandom;
		}
		//System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static int[] splitArray(int[] a, int start, int end) {
		int[] arr = new int[1000];
		int index = 0;

		for (int i = start; i < end; i++) {
			arr[index] = a[i];
			index++;
		}
		//System.out.println(Arrays.toString(arr));
		return arr;
	}

	public static int sumValueArray(int[] arr) {
		int sum = 0;

		for (int i = 0; i < 4; i++) {
			sum += arr[i];
		}
		//System.out.println(sum);
		return sum;
	}

}
