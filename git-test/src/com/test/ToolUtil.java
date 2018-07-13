package com.test;

public class ToolUtil {
	public static void main(String[] args) {
		/*for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j +" * "+ i +" ");
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 9; i <= j; j--) {
				System.out.print(i +" * "+ j +" ");
			}
			System.out.println();
		}
	}
}
