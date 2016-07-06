import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		 //task1
//		 int a[] = { 4 };
//		 int b[] = { 3 };
//		 int N = 20;

		// //task2
		int a[] = { 3, 2 };
		int b[] = { 2, 3 };
		int N = 9;

		for (int n = 1; n <= N; n++) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (n % a[i] == 0 && n % b[j] != 0) {
						System.out.print(n + " ");
					}
				}
			}
		}
	}
}
