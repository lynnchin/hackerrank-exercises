package com.hackerrank.coding.exercises;

/**
 * Created by lynnchin on 18/10/2018.
 */
public class RotateLeft {

	static int[] rotLeft(int[] a, int d) {
		for (int j = 1; j <= d; j++) {
			int temp = a[0];
			for (int i = 1; i < a.length; i++) {
				int swap = a[i];
				a[i - 1] = swap;
			}

			a[a.length - 1] = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] result = RotateLeft.rotLeft(new int[] {1, 2, 3, 4, 5}, 4);

		for (int i = 0; i < result.length; i++) {
			System.out.println("Result: " + result[i]);
		}
	}
}
