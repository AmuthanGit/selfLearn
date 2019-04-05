package array.sort;

import java.util.Arrays;

public class SelectionSort {
	
public static void main(String[] args) {
	int arr[]= {7,3,5,43,11,-2,2};
	sort(arr,arr.length);
	System.out.println(Arrays.toString(arr));
}

private static void sort(int[] arr, int n) {
	int temp;
	for (int i = 0; i <n-1; i++) {
		for (int j = i+1; j < n; j++) {
			if(arr[j]<arr[i]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		
	}
	
}
}
