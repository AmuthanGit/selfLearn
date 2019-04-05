package array.rotate;

import java.util.Arrays;

public class RotateArrayByReverse {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8};
	rotateArray(arr,4,arr.length);
	printArray(arr);
}

private static void printArray(int[] arr) {
	System.out.println(Arrays.toString(arr));
	
}

private static void rotateArray(int[] arr, int k, int n) {
	reverseArray(arr,0,k-1);
	reverseArray(arr, k, n-1);
	reverseArray(arr, 0, n-1);
}

private static void reverseArray(int[] arr, int start, int end) {
	int temp;
	while(start<end) {
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
}
