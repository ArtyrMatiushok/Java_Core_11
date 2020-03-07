package les11.packArrInt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array length: ");
		Integer[] arr = new Integer[in.nextInt()];
		System.out.println("Before sorting: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*200 - 100);
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("After sorting: ");
		for (int i : arr)
			System.out.print(i + ", ");
		System.out.println();
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("After reverse sorting: ");
		for (int i : arr)
			System.out.print(i + ", ");
	}

}
