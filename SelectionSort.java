package com.codingninja.coding.questios;

class SelectionSort {
	public static void selectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for (int j = i; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}

			}
			int tem = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tem;

		}

	}

	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);

		}

	}

	public static void main(String[] args) {

		int[] arr = { 12, 34, 10, 2, 4, 8, 22 };
		selectionSort(arr);
		printArray(arr);

	}
}