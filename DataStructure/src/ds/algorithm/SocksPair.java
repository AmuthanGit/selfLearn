package ds.algorithm;

public class SocksPair {
	public static void main(String[] args) {
		int[] ar= {9,10 ,20 ,20, 10 ,10, 30, 50, 10 ,20};
		int n=ar.length;
		int pair=sockMerchant(n, ar);
		System.out.println("pair "+pair);
	}

	static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		for (int i = 0; i < n - 1; i++) {
			int occurance = 1;
			for (int j = i + 1; j < n; j++) {

				if (ar[i] == ar[j]) {
					occurance = occurance + 1;
					if ((occurance % 2) == 0) {
						pairs++;
					}
				}
			}
		}
		return pairs;
	}
}
