package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int length = arr.length;
		Arrays.sort(arr);
		
		System.out.println("Missing elements");

		for(int i = 1; i < +length; i++) {
			if (i != arr[i - 1]) {
				System.out.println(i + 1);
			}
		}
	}

}
