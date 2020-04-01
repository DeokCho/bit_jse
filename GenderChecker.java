package com.jse.app;


import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
		find();
	}
	static void find() {
		System.out.println("주민번호를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		
		char ch = number.charAt(7);
		
		String result;
		switch(ch) {
		case '1': case '3': result= "남자"; break;
		case '2': case '4': result= "여자"; break;
		case '5': case '6': result= "외국인"; break;
		default: result= "외국인"; break;
		}
		System.out.println(result);
	}	
}

