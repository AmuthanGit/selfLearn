package array.sort;

import java.util.Arrays;

//Java program for implementation of Bubble Sort 
public class BubbleSort {
	private static void bubbleSort(int[] arr, int n) {
		int temp;
		boolean swap;
		for (int i = 0; i < n - 1; i++) {
			swap=false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap=true;
				}
			}
			if(swap==false) {
				System.out.println("Sorted array");
				System.out.println(Arrays.toString(arr));
				System.exit(1);;
			}

		}

	}

	/* Prints the array */
	private static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		//int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		int arr[] = { 11 ,12 ,22 ,25,34 ,64 ,90  };
		bubbleSort(arr, arr.length);
		printArray(arr);
	}

}
