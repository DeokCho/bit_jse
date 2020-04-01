package com.jse.app;

import java.util.Scanner;

public class TestEngine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("0 : 종료, 1 : 가위바위보, 2 : 홀짝, 3 : 합계");
			int flag = sc.nextInt();
			switch(flag) {
			case 0: System.out.println("종료"); return;
			case 1: RPS.game(); break;
			case 2: Dice2.switchDice(); break;
			case 3: Sum1To5.sum(); break;
			}
		}
	}
}