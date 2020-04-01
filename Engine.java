package com.jse.app;

import java.util.Random;
import java.util.Scanner;

public class Engine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) { // 무한 Loop - 서버
			System.out.println("0 : 종료, "
					+ "1 : 가위바위보, "
					+ "2 : 주사위 맞추기 게임"
					+ "3 : 1부터 100까지의 합");
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
