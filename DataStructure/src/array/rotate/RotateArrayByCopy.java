package array.rotate;

import java.util.Arrays;

public class RotateArrayByCopy {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10,12};
		rotateArray(arr,2,arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr, int k, int n) {
		int part1[]=new int[k];
		int part2[]=new int[n-k];
		System.arraycopy(arr, 0, part1, 0, part1.length);
		System.arraycopy(arr, part1.length, part2, 0, part2.length);
		System.arraycopy(part2, 0, arr, 0, part2.length);
		System.arraycopy(part1, 0, arr, part2.length, part1.length);
		
	}
}
