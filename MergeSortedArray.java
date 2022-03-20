package com.codingninja.coding.questios;

public class MergeSortedArray {

	public static int[] mergeSortedArray(int[] arr1, int[] arr2) {

		int m = arr1.length;
		int n = arr2.length;
		int[] arr = new int[m + n];

		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {

			if (arr1[i] <= arr2[j]) {

				arr[k] = arr1[i];
				i++;
				k++;
			} else {
				arr[k] = arr2[j];
				j++;
				k++;
			}
		}
			while (i < m) {
				arr[k] = arr1[i];
				i++;
				k++;
			}
			while (j < n) {
				arr[k] = arr2[j];
				j++;
				k++;
				
			}
			return arr;
		}
	
	public static  void printArry(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr1 = { 3, 5, 7, 10, 12, 23 };
		int[] arr2 = { 1, 2, 4, 6, 8, 9, 11 };
		
		int[] arr3 = mergeSortedArray(arr1,arr2);
		
		printArry(arr3);

	}

}
