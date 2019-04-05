package array.rotate;

public class RotateLeftByOneElement {

	public static void main(String[] args) {
		int arr[]={2,5,7,9,1,3,4,8};
		rotateLeft(arr,5,arr.length);
		printArray(arr);
	}
	private static void rotateLeft(int[] arr, int d, int length) {
		for (int i = 0; i < d; i++) {
			rotateLeftByOne(arr);
		}
	}
	private static void rotateLeftByOne(int[] arr) {
		int temp,j;
		temp=arr[0];
		for (j = 0; j < arr.length-1; j++) {
			arr[j]=arr[j+1];
		}
		arr[j]=temp;
	}
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
