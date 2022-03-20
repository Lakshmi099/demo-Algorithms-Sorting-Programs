package com.codingninja.coding.questios;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
	}

	public static void printArr(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 23, 12, 25, 11, 45, 8, 5, 4, 2 };

		bubbleSort(arr);
		printArr(arr);

	}

}
