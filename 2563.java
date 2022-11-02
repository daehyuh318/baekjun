package test;

import java.util.Scanner;

public class p2563 {

	public static void main(String[] args) {
		int[][] arr = new int[100][100];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int n = sc.nextInt();
		int x = 0;
		int y = 0;
		for (int i = 0; i < n; i++) {
			 x = sc.nextInt();
			 y = sc.nextInt();
			for (int j = x; j < x+10; j++) {
				for (int j2 = y; j2 < y+10; j2++) {
					if(arr[j][j2] == 0) {
						sum++;
					}
					arr[j][j2] = 1;
				}
			}
		}
		
		System.out.println(sum);
		
	}

}
