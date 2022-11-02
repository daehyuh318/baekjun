package test;

import java.util.Arrays;
import java.util.Scanner;

public class p2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int sum = 0;
		for (int i : arr) {
			sum = sum+i;
		}
		
		System.out.println(sum/5);
		System.out.println(arr[2]);

	}

}
