package com.test;

import java.util.Arrays;

public class Test {
	public static void main2(String[] args) {
		System.out.println("Hello World");
		int[] array = {2,8,5,4};
		System.out.println(binarySearch(array, 5));
	}
	
	public static int binarySearch(int[] array, int key){
		return Arrays.binarySearch(array, key);
	}
	public static void main(String[] args) {
		
	}
	
	public static void test(){
		System.out.println("ss");
	}
}
