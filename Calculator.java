package com.jse.app;

import java.util.Scanner;
//public class Calculator {
//	public static void main(String[] args) {
//		
//		System.out.println("첫번째 수는?");
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
//		System.out.println("두번째 수는?");
//		int b = scanner.nextInt();
//		int c = a + b;
//		System.out.println("두수의 합은? "+c);
//
//		
//	}
//}


public class Calculator{
	public static void main(String[] args) {
		System.out.println("1?");
		Scanner scanner = new Scanner(System.in);
		//			ㄴ Scanner는 값을 저장하는 것이 아닌 읽는 역할만 하기 때문에 
		//			    중복해서 작성할 필요 X (메모리 낭비)
		int a = scanner.nextInt();
		System.out.println("2?");
		int b = scanner.nextInt();
		System.out.println("3?");
		int c = scanner.nextInt();
		System.out.println("4?");
		int d = scanner.nextInt();
		int e = a+b+c+d;
		//		ㄴ abcd는 계산이 끝날때까지 값이 저장이 되어야 하기 때문에 a로만 하는 것은
		//		    결과값 도출을 못해서, abcd로 진행해야함.
		System.out.println(e);
		
	}
}