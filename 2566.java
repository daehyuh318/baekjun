package test;

import java.util.Scanner;

public class p2566 {

	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		int max = -1;
		int x = 0;
		int y = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
				if (max < arr[i][j]) {
					x = i+1;
					y = j+1;
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);
		System.out.println(x+" "+y);
		
	}
	
}
