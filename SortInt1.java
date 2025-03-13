package segwisis;

import java.util.Arrays;
import java.util.Scanner;

public class SortInt1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] str = new int[n];
		int temp;
		System.out.println("Original array");
		for (int i = 0; i < str.length; i++) {
			str[i] = scan.nextInt();
		}
		System.out.println("Befor sort array");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		Arrays.sort(str);
		System.out.println("Sorted array");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}
}

